package strings;

public class ReverseStrings {

	public static void main(String[] args) {
		reverseString("Seremba");
	}

	/**
	 * prints strings in reverse order
	 * @param text text to print
	 */
	public static void reverseString(String text) {
      for(int i = text.length()-1; i >= 0; i--){
	      System.out.print(text.charAt(i));
      }
	}
}
