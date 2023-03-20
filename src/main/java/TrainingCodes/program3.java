package TrainingCodes;
/**
 * 
 */

/**
 * @author ritug
 *
 */
import java.util.Scanner;
public class program3 {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age");
		int age =sc.nextInt();
		if(age<18)
		{
			System.out.println(" you are still minor");
		}
		else if(age>65) {
			System.out.println("you are senior citizen");
		}
		else {
			System.out.println("you r eligible");
		}

	}

}
