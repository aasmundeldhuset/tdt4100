package misc;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FileInputOutput {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = null;
        int lineCount = 0;
        int wordCount = 0;
        Set<String> uniqueWords = new HashSet<String>();
        Map<String, Integer> frequencies = new HashMap<String, Integer>();
        try {
            FileInputStream in = new FileInputStream("E:\\Private\\NTNU\\java\\test.txt");
            sc = new Scanner(in);
            // Alternativ til Scanner:
            // InputStreamReader reader = new InputStreamReader(in, Charset.forName("UTF-8"));
            // BufferedReader buf = new BufferedReader(reader);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] lineWords = line.split(" ");
                for (String lineWord : lineWords) {
                    String lowerWord = lineWord.toLowerCase();
                    uniqueWords.add(lowerWord);
                    if (frequencies.containsKey(lowerWord)) {
                        frequencies.put(lowerWord, frequencies.get(lowerWord) + 1);
                    } else {
                        frequencies.put(lowerWord, 1);
                    }
                }
                wordCount += lineWords.length;
                lineCount++;
            }
        } finally {
            if (sc != null) {
                sc.close();
            }
        }

        BufferedWriter bufWriter = null;
        try {
            FileOutputStream out = new FileOutputStream("E:\\Private\\NTNU\\java\\report.txt");
            OutputStreamWriter writer = new OutputStreamWriter(out);
            bufWriter = new BufferedWriter(writer);
            bufWriter.append("Number of lines: " + lineCount + "\n");
            bufWriter.append("Number of words: " + wordCount + "\n");
            bufWriter.append("Number of unique words: " + uniqueWords.size() + "\n");
            ArrayList<String> ordered = new ArrayList<String>(uniqueWords);
            Collections.sort(ordered);
            for (String uniqueWord : ordered) {
                bufWriter.append(uniqueWord + "\n");
            }
            for (String word : frequencies.keySet()) {
                bufWriter.append(word + ": " + frequencies.get(word) + "\n");
            }
        } finally {
            if (bufWriter != null) {
                bufWriter.close();
            }
        }
    }
}
