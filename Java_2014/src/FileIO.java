import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class FileIO {
    public static void main(String[] args) {
        FileInputStream fstream = null;
        InputStreamReader reader = null;
        BufferedReader buffered = null;
        try {
            fstream = new FileInputStream("e:\\test.txt");
            reader = new InputStreamReader(fstream, "utf-8");
            buffered = new BufferedReader(reader);
            FileReader fr = new FileReader("");
            Scanner sc = new Scanner(fr);
            
            Map<String, Integer> frequencies = new HashMap<String, Integer>();
            while (true) {
                String nextLine = buffered.readLine();
                if (nextLine == null)
                    break;
                String[] words = nextLine.split(" ");
                for (String word : words) {
                    if (frequencies.containsKey(word)) {
                        frequencies.put(word, frequencies.get(word) + 1);
                    }
                    else {
                        frequencies.put(word, 1);
                    }
                }
            }
            
            for (Entry<String, Integer> entry : frequencies.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
        catch (IOException e) {
            System.out.println("I/O error: " + e.getMessage());
        }
        finally {
            try {
                if (buffered != null)
                    buffered.close();
                if (reader != null)
                    reader.close();
                if (fstream != null)
                    fstream.close();
            }
            catch (IOException e) {
                System.out.println("Giving up");
            }
        }
    }
}
