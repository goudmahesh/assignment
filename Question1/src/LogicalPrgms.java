

import java.util.Scanner;

public class LogicalPrgms {

	public static void lowerCaseToUpperCase(String str){
		StringBuilder sb = new StringBuilder(str);
		for (int i = 0; i < sb.length(); i++) {
		    char c = sb.charAt(i);
		    if (Character.isLowerCase(c)) {
		        sb.setCharAt(i, Character.toUpperCase(c));
		    } else {
		        sb.setCharAt(i, Character.toLowerCase(c));
		    }
		}
		System.out.println("replace uppercase with lowercase and vice-vesa - "+sb.toString());
	}
	public static void wordsCount(String str){
		String words[] = str.split(" ");
		System.out.println("Number of words in the string- "+words.length);
	}
	public static void whiteSpacesCount(String str){
		int spaces=0;
		for(int i=1; i<str.length(); i++){
			if(Character.isWhitespace(str.charAt(i)))
				spaces++;
		}
		System.out.println("Number of spaces in the string- "+spaces);
	}
	public static void stringReversal(String str){
		StringBuilder strBuild = new StringBuilder(str);
		System.out.println("Reversal of the String- "+strBuild.reverse());
	}
	public static void specialCharsCount(String str){
		String SPECIAL_CHARS = "[!@#$%^&*()\\[\\]|;',./{}\\\\:\"<>?]";
		int splCharsCount = str.split(SPECIAL_CHARS).length+1;
		System.out.println("Number of special characters in the string: "+splCharsCount);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input: ");
		String inputStr = sc.nextLine();
		wordsCount(inputStr);
		lowerCaseToUpperCase(inputStr);
		specialCharsCount(inputStr);
		whiteSpacesCount(inputStr);
		stringReversal(inputStr);
	}
}
