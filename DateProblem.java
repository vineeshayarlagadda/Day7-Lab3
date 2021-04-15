package day7.LAB3;
import java.time.Period;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class DateProblem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the date in the format of yyyy mm dd : ");
		System.out.println("1. Enter the year : ");
		int y=sc.nextInt();
		System.out.println("2. Enter the month : ");
		int m=sc.nextInt();
		System.out.println("3. Enter the date : ");
		int d=sc.nextInt();
		LocalDate givenDate=LocalDate.of(y, m, d);
		LocalDate currentDate=LocalDate.now();
		Period difference=currentDate.until(givenDate);
		System.out.println("The difference is " + difference.getYears()+" years, "+difference.getMonths()+" months and "+difference.getDays()+" days.");
	}

}
