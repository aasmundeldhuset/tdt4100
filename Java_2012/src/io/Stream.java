package io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Stream {
	public static void main(String[] args) throws Exception {
		InputStream stream = new FileInputStream("e:\\test.txt");
		InputStreamReader reader = new InputStreamReader(stream);
		BufferedReader bufReader = new BufferedReader(reader);
		while (true) {
			String line = bufReader.readLine();
			if (line == null)
				break;
			System.out.println(line);
		}
	}
}
