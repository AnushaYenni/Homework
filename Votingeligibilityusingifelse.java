package simplilearn.org.com;
import java.util.Scanner;

public class Votingeligibilityusingifelse {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the candidates age");
		int age=sc.nextInt();
		if(age>=18) {
			System.out.println("Candidate is eligible for vote");
			
		}
		else {
			System.out.println("Candidate is not eligible for vote");
		}
	}

}
