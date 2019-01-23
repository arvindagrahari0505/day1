import java.util.Scanner;

public class NonRepeatCharExample {

	
	static void getCharacter(String str) {
		char count[] = new char[256];
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
        	System.out.print(str.charAt(index)+", ");
        }
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		String[] strArray = new String[size];
		System.out.println("Enter String Array : ");
		for(int i=0;i<size;i++) {
			strArray[i] = sc.next().toLowerCase();
		}
		for(int i=0;i<size;i++) {
			getCharacter(strArray[i]);
		}
		sc.close();
	}

}
