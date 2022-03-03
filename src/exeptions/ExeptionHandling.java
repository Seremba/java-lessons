package exeptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExeptionHandling {

	public static void main(String[] args) {
//		createNewFile();
		numbersExceptionHandling();
	}

	public static void numbersExceptionHandling() {
		File file = new File("resources/numbers.txt");
		Scanner fileReader = null;

		try {
			 fileReader = new Scanner(file);
			if(fileReader.hasNext()){
				double nums =  fileReader.nextDouble();
				System.out.println(nums);
			}
		}
		catch (FileNotFoundException | InputMismatchException e) {
			e.printStackTrace();
		} finally{
			fileReader.close();
		}
	}

	public static void createNewFile() {
		File file = new File("resources/non-existent.txt");
		try {
			file.createNewFile();
		}
		catch (IOException e) {
			System.out.println("file does not exits");
			e.printStackTrace();
		}
	}
}
