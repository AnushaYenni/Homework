package simplilearn.org.com;
import java.util.Scanner;
public class Votingeligibility {
	public static void main(String[] args) {
		
	
  Scanner sc=new Scanner(System.in);
 System.out.println("Enter the age of the candidate");
 int a = sc.nextInt();
 System.out.println(a>=18? a+"is eligible for vote": a+"is not eligible for vote");
 
 
	}
}
