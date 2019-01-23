import java.util.Scanner;

public class PanagramDetector {
	
	static String findMissingLetters(String str) {
		String ans="";
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
				char temp=(char)(i+97);
				ans+=temp+" ";
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.nextLine().toLowerCase().replaceAll("[^a-zA-Z]", "");
		String ans = findMissingLetters(str);
		if(ans=="") {
			System.out.println("There is no alphabet needed to form a Panagram");
		}
		else {
			System.out.println("Alphabet needed to form a Panagram are : "+ans);
		}
		sc.close();
	}

}
