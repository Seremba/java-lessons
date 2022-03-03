package arrays;

import java.util.Scanner;

/*
create a program, that allows a user to create any number of grades and
provides them with their average score as well as the highest and lowest score
 */
public class Grades {
    private static int[] grades;
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {

		System.out.println("How many grades do you want to enter? ");
		grades = new int[scanner.nextInt()];

		getGrades();
		System.out.println("Average "+ String.format("%.2f", calculateAverage()));
		System.out.println("Highest: " + getHighest());
		System.out.println("Lowest: " + getLowest());
	}

	public static void getGrades() {
		for (int i = 0; i < grades.length; i++) {
			System.out.println("Enter grade #" + (i + 1));
			grades[i] = scanner.nextInt();
		}
	}
	public static int calculateSum(){
		int sum = 0;
		for (int grade: grades) {
			sum = sum + grade;
		}

		return sum;
	}

	public static int calculateAverage(){
		return calculateSum() / grades.length;
	}
	public static int getHighest(){
		int highest = grades[0];
		for(int grade : grades){
			if(grade > highest){
				highest = grade;
			}
		}
		return highest;
	}
	public static int getLowest(){
		int lowest = grades[0];
		for(int grade : grades){
			if(grade < lowest){
				lowest = grade;
			}
		}
		return lowest;
	}

}
