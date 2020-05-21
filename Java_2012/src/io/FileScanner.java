package io;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class FileScanner {
	public static void main(String[] args) throws Exception {
		InputStream stream = new FileInputStream("e:\\test.txt");
		Scanner sc = new Scanner(stream);
		while (sc.hasNextInt()) {
			System.out.println(sc.nextInt());
		}
	}
}
