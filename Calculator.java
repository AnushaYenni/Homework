package simplilearn.org.com;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a number a" );
			int a = sc.nextInt();
			System.out.println("Enter a number b");
			int b = sc.nextInt();
			System.out.println("Enter the operation to be performed D:");
			int D=sc.nextInt();			
  while(D<=1){
			  System.out.println("Summation of a and b is:"+(a+b)); 
			  break;
			  }
  while(D==2) {
			  System.out.println(a-b);
			  break;
  }
  while(D==3) {
			  System.out.println(a*b);
			  break;
  }
  while(D==4) {
			  System.out.println(a/b);
			  break;
  }
		}
		

	}
}


