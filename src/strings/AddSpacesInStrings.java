package strings;

public class AddSpacesInStrings {

	public static void main(String[] args) {
		addSpaces("HeyWord,ILoveMySarah");
	}

	/**
	 * add spaces before each capital letter
	 * @param text disorganized text
	 */
	public static void addSpaces(String text) {
		StringBuilder modifiedText = new StringBuilder(text);

		for (int i = 0; i < modifiedText.length(); i++) {
			if(i!=0 && Character.isUpperCase(modifiedText.charAt(i))){
				modifiedText.insert(i, " ");
				i++;
			}
		}
		System.out.println(modifiedText);
	}
}
