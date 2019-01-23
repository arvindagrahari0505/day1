import java.util.Scanner;

public class DuplicateWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine();
		String[] word = str.split(" ");
		
		for(int i=0;i<word.length;i++) {
			if(word[i]!=null) {
				for(int j=i+1;j<word.length;j++) {
					if(word[i].equals(word[j])) {
						word[j]=null;
					}
				}
			}
		}
		
		for(int i=0;i<word.length;i++) {
			if(word[i]!=null) {
				System.out.print(word[i]+" ");
			}
		}
		sc.close();
	}

}
