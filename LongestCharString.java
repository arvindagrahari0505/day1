import java.util.Scanner;

public class LongestCharString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		
		int len=str.length();
		int c=0;
		int index=0;
		char result = str.charAt(0);
		for(int i=0;i<len;i++) {
			int temp=1;
			for(int j=i+1;j<len;j++) {
				if(str.charAt(i)!=str.charAt(j)) {
					break;
				}
				temp++;
			}
			if(temp>c) {
				index=i;
				result=str.charAt(i);
				c=temp;
			}
		}
		System.out.println("Longest occurring character is "+result+" and length is "+c+" at index "+index);
		sc.close();
	}

}
