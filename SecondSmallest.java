import java.util.Scanner;

public class SecondSmallest {

	static void secondSmall(int[] arr) {
		
		int a,b;
		if(arr.length<2) {
			System.out.println("Array length should be more then 1");
			return;
		}
		else {
			a=Integer.MAX_VALUE;
			b=Integer.MAX_VALUE;
			
			for(int i=0;i<arr.length;i++) {
				if(arr[i]<a) {
					b=a;
					a=arr[i];
				}
				else if(arr[i]<b && arr[i]!=a) {
					b=arr[i];
				}
			}
			
			if(b==Integer.MAX_VALUE) {
				System.out.println("There is no second smallest number");
			}
			else {
				System.out.println("Second Largest value is "+b);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		System.out.println("Enter the array element");
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		secondSmall(arr);
		sc.close();
		
	}

}
