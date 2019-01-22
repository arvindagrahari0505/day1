import java.util.Scanner;
public class Panagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().toLowerCase().replaceAll("[^a-zA-Z]", "");
		int[] arr = new int[26];
		for(int i=0;i<26;i++) {
			arr[i]=0;
		}
		for(int i=0;i<str.length();i++) {
			int index = (str.charAt(i)-97);
			arr[index]++;
		}
		for(int i=0;i<26;i++) {
			if(arr[i]==0) {
				System.out.println("It is not a Panagram");
				System.exit(0);
			}
		}
		System.out.println("It is a Panagram");
		sc.close();
	}

}
