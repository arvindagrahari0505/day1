import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		
		char[] arr= str.toCharArray();
		char[] res=new char[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==' ') {
				res[i]=' ';
			}
		}
		int j=arr.length-1;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=' ') {
				if(res[j]==' ') {
					j--;
				}
				res[j]=arr[i];
				j--;
			}
		}
		
		String output=new String(res);
		System.out.println(output);
		sc.close();

	}

}
