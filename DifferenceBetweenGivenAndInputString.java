import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class DifferenceBetweenGivenAndInputString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] givenString = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		char[] input = sc.nextLine().toLowerCase().replaceAll("[^a-zA-Z]", "").toCharArray();
		input = removeDuplicate(input,input.length);
		System.out.println(input);
		for(int i=0;i<givenString.length;i++) {
			int flag=0,j=0;
			while(j<input.length) {
				if(givenString[i]==input[j]) {
					flag=1;
					break;
				}
				j++;
			}
			if(flag==0) {
				System.out.print(givenString[i]+" ");
			}
		}
		sc.close();
	}
	
	static char[] removeDuplicate(char str[],int n) { 

		Set<Character> charSet = new LinkedHashSet<Character>();
		for (char c : str) {
		    charSet.add(c);
		}

		StringBuilder sb = new StringBuilder();
		for (Character character : charSet) {
		    sb.append(character);
		}
		return sb.toString().toCharArray(); 
	} 
}
