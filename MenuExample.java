import java.util.Scanner;

public class MenuExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		double a = sc.nextInt();
		double b = sc.nextInt();
		System.out.println("Enter your choice\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\nPress any other key to exit");
		int choice = sc.nextInt();
		double ans;
		switch(choice) {
		case 1:
			ans=a+b;
			System.out.println(a+" + "+b+" is "+ans);
			break;
		case 2:
			ans=a-b;
			System.out.println(a+" - "+b+" is "+ans);
			break;
		case 3:
			ans=a*b;
			System.out.println(a+" * "+b+" is "+ans);
			break;
		case 4:
			ans=a/b;
			System.out.println(a+" / "+b+" is "+ans);
			break;
		default:
			System.out.println("Program is sucessfully Terminated");
			System.exit(0);
		}
		sc.close();
	}

}
