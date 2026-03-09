package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) {
		// code to create the file

		File myFile = new File("src/fileHandling/data.txt");

		// File myFile = new File( "data.txt");
		try {
			myFile.createNewFile();
		} catch (Exception e) {
			System.out.println("Unable to create a file.");
			e.printStackTrace();
		}

		// Code to write the file

		try {
			FileWriter fileWriter = new FileWriter("src/fileHandling/data.txt");

			fileWriter.write("This is our first file file of java programming. ");

			fileWriter.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
