import java.util.Scanner;

public class PowerOfFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int temp = num;
		int count=0;
		while(temp!=0) {
			temp/=5;
			count++;
		}
		count--;
		int res = (int) Math.pow(5, count);
		if(res==num) {
			System.out.println("True (5 power "+count+" is "+res+")");
		}
		else {
			System.out.println("False (Not power of 5)");
		}
		
		sc.close();
	}

}
