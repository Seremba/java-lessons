package arrays;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {
	private static final int LENGTH = 6;
	private static final int MAX_TICKET_NUMBER = 69;

	public static void main(String[] args) {
       int[] ticket = generateNumbers();
	   Arrays.sort(ticket);
	   printTicket(ticket);
	}

	public static int[] generateNumbers(){
		int[] ticket = new int[LENGTH];

		Random random = new Random();
        /*
        Generate random number and search to make sure there is no duplicate in the array
         */

		for (int i = 0; i < LENGTH; i++) {
			int randomNumber;
			do {
				randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
			}while(search(ticket, randomNumber));
			// number is unique if we reach this point, then add it to the array
			ticket[i] = randomNumber;
		}
		return ticket;
	}

	/**
	 * this does a sequential search on the array to find a value
	 * @param array this is the array to search
	 * @param numberToSearchFor this is the value to search for
	 * @return true if found and false if not found
	 */
	public static boolean search(int[] array, int numberToSearchFor) {
		// this is called an enhanced loop
		// it iterates through 'array' and each time assigns the current element to value

		for(int value : array){
			if(value == numberToSearchFor){
				return true;
			}
		}
		/*
		if we reach this point(outside the loop), it means that the entire array was searched and value not found
		 */
		return  false;
	}


	public static void printTicket(int[] ticket){
		for (int i = 0; i < LENGTH; i++) {
			System.out.print(ticket[i] + " | ");
		}
	}

}
