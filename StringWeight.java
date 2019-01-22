import java.util.Scanner;

public class StringWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String ");
		String str = sc.next();
		char[] charArr = str.toLowerCase().trim().toCharArray();
		int sum=0;
		for(int i=0;i<charArr.length;i++) {
			int ascii =(int) charArr[i];
			sum=sum+ascii-96;
		}
		System.out.println(sum);
		sc.close();
	}

}

