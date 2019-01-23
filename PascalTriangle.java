import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the cordinates : ");
		int r = sc.nextInt();
		int c = sc.nextInt();
		int temp=1;
		for(int i=1;i<c;i++) {
			temp=temp*(r-i)/i;
		}
		System.out.println("Output : "+temp);
		sc.close();
	}

}
