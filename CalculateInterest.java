package simplilearn.org.com;
import java.util.Scanner;
public class CalculateInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principal amount");
		int P=sc.nextInt();
		System.out.println("Enter the rate of interest");
		Double R = sc.nextDouble();
		System.out.println("Enter the number of years");
		int T =sc.nextInt();
		Double SI=0.0;
		SI=P*T*R/100;
		System.out.println(SI+ "is the simpleinterest for the given data");
		
		

	}

}
