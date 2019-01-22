import java.util.Scanner;

public class PrimeNumberSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for(int j=2;j<=num;j++) {
			
			int flag=0;
			
			for(int i=2;i<=j/2;i++) {
				if(j%i==0) {
					flag=1;
					break;
				}
			}
			if(flag==0){
				System.out.print(j+" ");
			}
		}
		sc.close();
	}

}
