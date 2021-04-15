package day7.LAB3;

import java.util.Scanner;

public class ReplaceConsonants {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input string : ");
		String input=sc.nextLine();
		System.out.println("The string after replacing all the consonants with the next character is : "+alterString(input));
	}
	
	//------Replace Consonants-------
	
	public static String alterString(String input) {
		String alphabets="abcdefghijklmnopqrstuvwxyz";
		String vowels="aeiou";
		String result="";
		for(int i=0;i<input.length();i++) {
			int flag=0;
			char A=input.charAt(i);
			char a=Character.toLowerCase(A);
			int index=alphabets.indexOf(a);
			for(int j=0;j<5;j++) {
				char b=vowels.charAt(j);
				if(a==b) { 
					flag=1;
					if(Character.isUpperCase(A))result+=Character.toUpperCase(a);
					else result+=a;
				}
			}
			if(flag==0) {
				if(A=='Z') {
					result+='A';
				}
				else if(A=='z')result+='a';
				else {
					char ch=alphabets.charAt(index+1);
					if(Character.isUpperCase(A)) result+=Character.toUpperCase(ch);
					else result+=ch;
				}
				
			}
		}
		return result;
	}
	
	

}
