package simplilearn.org.com;
import java.util.Scanner;

public class Divisibilityby5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number!!");
		int num=sc.nextInt();
		System.out.println(num%5==0? num+"is divisible by 5": num+"is not divisible by 5");

	}

}
