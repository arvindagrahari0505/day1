import java.util.Arrays;
import java.util.Scanner;

public class MedianExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of first array : ");
		int size1 = sc.nextInt();
		System.out.println("Enter element in the array 1 : ");
		int[] arr1 = new int[size1];
		for(int i=0;i<size1;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter size of second array : ");
		int size2 = sc.nextInt();
		System.out.println("Enter element in the array 2 : ");
		int[] arr2 = new int[size2];
		for(int i=0;i<size2;i++) {
			arr2[i]=sc.nextInt();
		}
		int[] result = new int[size1+size2];
		int i=0,j=0,k=0;
		while(j<size1) {
			result[i]=arr1[j];
			j++;
			i++;
		}
		while(k<size2) {
			result[i]=arr2[k];
			k++;
			i++;
		}
		Arrays.sort(result);
		
		if(result.length%2==0) {
			System.out.println(((result[result.length/2])+(result[(result.length/2)-1]))/2.0);
		}
		else {
			System.out.println(result[result.length/2]);
		}
		
		sc.close();
		
	}

}
