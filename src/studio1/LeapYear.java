package studio1;
import java.util.Scanner; 

public class LeapYear {
	public static void main (String[] args) {
		Scanner year = new Scanner(System.in);
		System.out.println("Type in a year: ");
		int input = year.nextInt();
		boolean leapyear = (input%4 == 0) && !(input%100 == 0) || (input%400 == 0);
		
		System.out.println(input + " is a leap year: "+ leapyear);
	}

}
