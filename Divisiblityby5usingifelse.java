package simplilearn.org.com;
import java.util.Scanner;

public class Divisiblityby5usingifelse {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number!!");
		int num=sc.nextInt();
		if(num%5==0) {
			System.out.println(num+"is divisible by 5");
		}
		else {
			System.out.println(num+"is not divisible by 5");
		}
		

	}

}
