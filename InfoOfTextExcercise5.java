package day7.LAB3;


public class InfoOfTextExcercise5 {
	public static void main(String[] args) {
		String input="Hey, how are you doing?\nI've been thinking about you.\rBy the way I'm waiting for our trip.";
		int noOfCharacters=input.length();
		
		char charLength[]=input.toCharArray();
		int noOfCharacters1=charLength.length;
		System.out.println("Number of characters : "+noOfCharacters1);
		
		String Lines[]=input.split("\n|\r");
		System.out.println("Number of lines : "+Lines.length);
		
		
		String words[]=input.split("\\s");
		System.out.println("Number of words : "+words.length);
		

	}
	

}
