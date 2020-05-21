package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Reader {
	public static void main(String[] args) throws Exception {
		Set<String> wordSet = new HashSet<String>(); 
		File file = new File("e:\\test.txt");
		FileReader reader = new FileReader(file);
		BufferedReader bufReader = new BufferedReader(reader);
		while (true) {
			String line = bufReader.readLine();
			if (line == null)
				break;
			String[] lineWords = line.split(" ");
			for (String lineWord : lineWords)
				wordSet.add(lineWord);
		}
		bufReader.close();
		
		OutputStream outStream = new FileOutputStream("e:\\output.txt");
		OutputStreamWriter sw = new OutputStreamWriter(outStream);
		BufferedWriter writer = new BufferedWriter(sw);
		for (String word : wordSet)
			writer.write(word + "\n");
		writer.close();
	}
}
