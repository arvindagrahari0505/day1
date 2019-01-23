import java.util.Scanner;

public class NonRepeatChar {
	
	static char count[] = new char[256];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.nextLine().replaceAll(" ","").toLowerCase();
		for (int i=0; i<str.length(); i++) {
            count[str.charAt(i)]++;
		}
		
		int index=-1; 
	       
        for (int i=0;i<str.length();i++) {
        	if(count[str.charAt(i)]==1) { 
        		index = i; 
        		break;
        	}
        }
        if(index!=-1) {
        	System.out.println("First Non Repeating Character is "+str.charAt(index));
        }
		sc.close();
	}

}