package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FileInputOutput {
    public static void main(String[] args) {
        FileInputStream stream = null;
        InputStreamReader reader = null;
        BufferedReader bufReader = null;
        try {
            stream = new FileInputStream("e:\\test.txt"); // This file must exist in order for the program to work...
            reader = new InputStreamReader(stream);
            bufReader = new BufferedReader(reader);
            String line;
            int lineCount = 0;
            int wordCount = 0;
            Set<String> words = new HashSet<String>();
            Map<String, Integer> wordFrequencies = new HashMap<String, Integer>();
            while ((line = bufReader.readLine()) != null) {
                lineCount++;
                String[] items = line.split(" ");
                for (int i = 0; i < items.length; i++) {
                    wordCount++;
                    String word = items[i];
                    
                    // Using a HashSet
                    words.add(word);
                    
                    // Using a HashMap
                    if (wordFrequencies.containsKey(word)) {
                        wordFrequencies.put(word, wordFrequencies.get(word) + 1);
                    }
                    else {
                        wordFrequencies.put(word, 1);
                    }
                }
                System.out.println(lineCount + ": " + line);
            }
            System.out.println(lineCount + " lines; " +
                               wordCount + " words; " + 
                               words.size() + " unique words");
            for (String word : words) {
                System.out.println(word);
            }
            for (String word : wordFrequencies.keySet()) {
                System.out.println(word + ": " + wordFrequencies.get(word));
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        catch (IOException e) {
            System.out.println("I/O error");
        }
        finally {
            try {
                if (bufReader != null)
                    bufReader.close();
                if (reader != null)
                    reader.close();
                if (stream != null)
                    stream.close();
            }
            catch (IOException e) {
                System.out.println("Failed to close file");
            }
        }
    }
}
