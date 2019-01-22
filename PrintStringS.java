import java.util.Scanner;

public class PrintStringS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of String Array");
		int num = sc.nextInt();
		System.out.println("Enter the Strings");
		String[] str = new String[num];
		for(int i=0;i<num;i++) {
			str[i] = sc.next();
		}
		for(int i=0;i<num;i++) {
			if(str[i].toLowerCase().charAt(0)=='s') {
				System.out.print(str[i]+" ");
			}
		}
		sc.close();
		
		
	}

}
