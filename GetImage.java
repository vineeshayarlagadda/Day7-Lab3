package day7.LAB3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class GetImage {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input string : ");
		String input = sc.next();
		System.out.println(getImage(input));
	}
	
	//---------Generate the mirror image of a String and add it to the existing string------------
	
	public static String getImage(String input) {
		String reverse="";
		for(int i=input.length()-1;i>=0;i--) {
			reverse+=(input.charAt(i));
		}
		return input+"|"+reverse;
	}
}
	
	
