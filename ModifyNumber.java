package day7.LAB3;
import java.util.*;


public class ModifyNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input number : ");
		int num=sc.nextInt();
		System.out.println("The resultant number is : "+modifyNumber(num));
	}
	
	//-------Accepts a number and modify it as per the requirement------
	
	public static int modifyNumber(int number1) {
		String s=Integer.toString(number1);
		String result="";
		int len=s.length();
		for(int i=0;i<len-1;i++) {
			int x=Integer.parseInt(String.valueOf(s.charAt(i)));
			int y=Integer.parseInt(String.valueOf(s.charAt(i+1)));
			int z=Math.abs(x-y);
			result+=Integer.toString(z); 
		}
		result+=s.charAt(len-1);
		int result1=Integer.parseInt(result);
		return result1;
	}

}
