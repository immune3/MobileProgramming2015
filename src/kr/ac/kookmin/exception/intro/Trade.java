package kr.ac.kookmin.exception.intro;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Trade {

	public void readFile() {
		String path = Trade.class.getResource("").getPath();
		BufferedReader inputStream = null;

		try {
			inputStream = new BufferedReader(new FileReader(path + "a.txt"));
			String line = null;

			while ((line = inputStream.readLine()) != null) {
				System.out.println(line);
			}

		} catch (FileNotFoundException e) {
			System.out.println("File Not Found!");
			System.exit(0);
		} catch (IOException e) {
			System.out.println("IO Error " + e);
			System.exit(0);
			
		} finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				System.out.println("Error Closing Input File");
				System.exit(0);
			}
		}
	}
}