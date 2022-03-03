package strings;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class TextProcessor {

	public static void main(String[] args) {
		countWords("I love my wife Sarah");
	}

	/**
	 * splits a string into an array by tokenizing it
	 * counts words and splits them
	 * @param text to be split
	 */
	public static void countWords(String text) {
		//split text at every point where there is a space
       String wordsToSplit = text;
	   String[] splittedWords = wordsToSplit.split(" ");
	   //count the number of splitted words
	   int numberOfWords = splittedWords.length;

	   String message = String.format("Your text contains %d words: ", numberOfWords);

		System.out.println(message);

		for (int i = 0; i < numberOfWords; i++) {
			System.out.println(splittedWords[i]);
		}
	}
}
