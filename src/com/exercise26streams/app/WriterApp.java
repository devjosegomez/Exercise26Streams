package com.exercise26streams.app;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
public class WriterApp {

	public static void main(String[] args) {
		File myFile = null;
		FileWriter myWriter = null;
		BufferedWriter myBuffer = null;

		try {
			myFile = new File("c:\\a\\b.txt");
			myWriter = new FileWriter(myFile, true); //Append 
			myBuffer = new BufferedWriter(myWriter);
			myBuffer.write("Jose app ");
			System.out.println("File was created");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				myBuffer.close();
				myWriter = null;
				myFile = null;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}	

}
