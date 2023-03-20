package TrainingCodes;
import java.util.Scanner;
public class program2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("$");
			}
			System.out.println();
			
		}
	}

}
