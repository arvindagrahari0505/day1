import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First String");
		String str1 = sc.nextLine();
		char[] arr1 = str1.toLowerCase().trim().replaceAll(" ", "").toCharArray();
		System.out.println("Enter second String");
		String str2 = sc.nextLine();
		char[] arr2 = str2.toLowerCase().trim().replaceAll(" ","").toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		String res1 = new String(arr1);
		String res2 = new String(arr2);

		if(res1.equals(res2)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}
		sc.close();
	}

}
