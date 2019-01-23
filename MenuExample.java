import java.util.Scanner;

public class MenuExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter your choice\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit");
			int choice = sc.nextInt();
			double ans,a,b;
			switch(choice) {
			case 1:
				System.out.println("Enter two numbers : ");
				a = sc.nextInt();
				b = sc.nextInt();
				ans=a+b;
				System.out.println(a+" + "+b+" is "+ans);
				break;
			case 2:
				System.out.println("Enter two numbers : ");
				a = sc.nextInt();
				b = sc.nextInt();
				ans=a-b;
				System.out.println(a+" - "+b+" is "+ans);
				break;
			case 3:
				System.out.println("Enter two numbers : ");
				a = sc.nextInt();
				b = sc.nextInt();
				ans=a*b;
				System.out.println(a+" * "+b+" is "+ans);
				break;
			case 4:
				System.out.println("Enter two numbers : ");
				a = sc.nextInt();
				b = sc.nextInt();
				ans=a/b;
				System.out.println(a+" / "+b+" is "+ans);
				break;
			case 5:
				System.out.println("Program is sucessfully Terminated");
				System.exit(0);
				break;
			default:
				System.out.println("You enter a wrong choice");
			}
	
		}
	}

}
