import java.util.Scanner;

public class PrimeNumberCheck {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int flag=0;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				flag=1;
				break;
			}
		}
		
		if(flag==1) {
			System.out.println(num+" is not prime");
		}
		else {
			System.out.println(num+" is prime");
		}
		
		sc.close();
	}
}
