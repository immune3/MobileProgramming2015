package kr.ac.kookmin.exception.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Makes numbered.txt the same as original.txt, but with each line numbered.
 */
public class AddLineNumber {
	public static void main(String[] args) {
		String path = AddLineNumber.class.getResource("").getPath();
		
		try {
			BufferedReader inputStream = new BufferedReader(new FileReader(path + "original.txt"));
			PrintWriter outputStream = new PrintWriter(new FileOutputStream("/home/phj/JavaLab/numbered.txt"));
			
			/**
			 * 구현하시오.
			 **/
			String line = null;
			int lineNumber = 1;
			while ((line = inputStream.readLine()) != null){
				outputStream.write(lineNumber + " " + line + "\n");
				lineNumber++;
			} 
			
			inputStream.close();
			outputStream.close();

			/** catch() 구문 작성하시오 **/
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found!");
			System.exit(0);
		} catch (IOException e) {
			System.out.println("IO Error " + e);
			System.exit(0);
		}

	}
}
