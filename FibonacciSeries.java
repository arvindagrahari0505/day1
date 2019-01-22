import java.util.Scanner;

public class FibonacciSeries {
	
	public static void main(String[] args)
	
	{
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int a=0,b=1;
		int temp;
		for(int i=0;i<num;i++)
		{
			System.out.print(a+" ");
			temp=a+b;
			a=b;
			b=temp;
		}
		
		sc.close();
	}
}
