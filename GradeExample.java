import java.util.Scanner;

public class GradeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter your marks percentage : ");
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();
		
		if(marks<50) {
			System.out.println("Fail");
		}
		else if(marks>=50&&marks<60) {
			System.out.println("Passing Marks");
		}
		else if(marks>=60&&marks<75) {
			System.out.println("First Class");
		}
		else {
			System.out.println("Distinction");
		}
		
		sc.close();
	}

}
