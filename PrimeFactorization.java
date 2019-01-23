import java.util.Scanner;

public class PrimeFactorization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		if(num>=2) {
			int temp=num;
			for(int i=2;i<temp;i++) {
				while(temp%i==0) {
					System.out.print(i+" ");
					temp=temp/i;
				}
			}
			if(temp>2) {
				System.out.print(temp);
			}
		}
		else {
			System.out.println("There is no prime factorization");
		}
		sc.close();
		
	}

}
