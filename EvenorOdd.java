package simplilearn.org.com;
import java.util.Scanner;
public class EvenorOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:");
		int a = sc.nextInt();
		System.out.println(a%2==0? a + "is a even number" : a + "is a odd number");
				}

}
