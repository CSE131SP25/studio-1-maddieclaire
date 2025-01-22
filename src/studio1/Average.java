package studio1;
import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		
		System.out.println("The first of two integers to be averaged?");
		Scanner n1 = new Scanner(System.in);
		int x = n1.nextInt();
		System.out.println("The second of two integers to be averaged?");
		int y = n1.nextInt();
		// TODO Auto-generated method stub
		double Average = (x+y)/2.0;
		System.out.println("Average of " + x + " and " + y + " is " + Average + ".");
	}

}
