package com.exercise26streams.app;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.util.Scanner;

public class WriterApp {

	public static void main(String[] args) {
		int table =0;
		final int LIMIT = 100;
		File myFile = null;
		FileWriter myWriter = null;
		BufferedWriter myBuffer = null;
		Scanner input = new Scanner(System.in);
		table = input.nextInt();
		
		
		try {
			myFile = new File("c:\\a\\b.txt");
			myWriter = new FileWriter(myFile, true); //true - Append /false - Overwrite
			myBuffer = new BufferedWriter(myWriter);
			
			System.out.println("Enter a number to multiply:");
			table = input.nextInt();
			
			for(int i =0; i<LIMIT; i++) {
				System.out.println(String.format("%d * %d = %d", table, i, table * i ));
				myBuffer.write("Jose app ");
			}
			
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
