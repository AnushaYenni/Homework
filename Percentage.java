package simplilearn.org.com;
import java.util.Scanner;
public class Percentage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the candidates percentage: ");
		int per=sc.nextInt();
		if(per>=70&&per<=100) {
			System.out.println("Candidate passed with Distinction");
		}
		else if(per>=60&&per<=69) {
			System.out.println("Candidate passed  with first class ");
		}
		else if(per>=50&&per<=59) {
			System.out.println("Candidate passed with second class");
		}
		else if(per>=35&&per<=49) {
			System.out.println("Candidate passed ");
		}
		else if(per>=0&&per<=34) {
			System.out.println("Candidate failed");
		}
		else if(per>100) {
			System.out.println("Kindly enter correct result");
		}
		else {
			System.out.println("Invalid number");
		}
		}
		
		

	}


