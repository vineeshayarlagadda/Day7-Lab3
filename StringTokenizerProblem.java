package day7.LAB3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerProblem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers : ");
		String input=sc.nextLine();
		StringTokenizer numbers=new StringTokenizer(input," ");
		int sum=0;
		while(numbers.hasMoreTokens()) {
			String s=numbers.nextToken();
			int num=Integer.parseInt(s);
			System.out.println(num);
			sum+=num;
	}
		System.out.println("The sum of numbers : "+sum);	
	}

}
