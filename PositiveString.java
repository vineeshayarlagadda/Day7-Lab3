package day7.LAB3;
import java.util.*;

public class PositiveString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input string : ");
		String input=sc.nextLine();
		System.out.println("Positive String : true");
		System.out.println("Not a positive string : false");
		System.out.println("=============================");
		System.out.println("Answer : "+isPositiveString(input));
	}
	
	public static boolean isPositiveString(String input) {
		String alphabets="abcdefghijklmnopqrstuvwxyz";
		for(int i=0;i<input.length()-1;i++) {
			char a=input.charAt(i);
			char b=input.charAt(i+1);
			if(alphabets.indexOf(a)>=alphabets.indexOf(b)) return false;	
		}
		return true;
	}

}
