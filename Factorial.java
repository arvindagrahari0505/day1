import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int result=1;
		
		for(int i=1;i<=num;i++) {
			result*=i;
		}
		
		System.out.println("Factorial of "+num+" is "+result);
		
		sc.close();
	}

}
