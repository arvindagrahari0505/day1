import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				System.out.print(' ');
				System.out.print(str.charAt(str.length()-i-1));
			}
			else {
				if(str.charAt(str.length()-i-1)==' ') {
					continue;
				}
				System.out.print(str.charAt(str.length()-i-1));
			}
		}
		sc.close();

	}

}
