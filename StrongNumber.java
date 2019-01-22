import java.util.Scanner;

public class StrongNumber {
	
	static int factorial(int num) {
		int res=1;
		for(int i=1;i<=num;i++) {
			res*=i;
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int sum=0;
		for(int i=0;i<str.length();i++) {
			int num = str.charAt(i)-48;
			sum = sum + factorial(num);
		}
		String res = Integer.toString(sum);
		if(res.equals(str)) {
			System.out.println(str+" is Strong Number");
		}
		else {
			System.out.println(str+" is not Strong Number");
		}
		sc.close();
	}

}
