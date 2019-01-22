import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int temp = num;
		int count=0;
		while(temp!=0) {
			temp/=2;
			count++;
		}
		count--;
		int res = (int) Math.pow(2, count);
		if(res==num) {
			System.out.println("True (2 power "+count+" is "+res+")");
		}
		else {
			System.out.println("False (Not power of 2)");
		}
		
		sc.close();
	}

}
