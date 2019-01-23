import java.util.Scanner;

public class NumerologyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.nextLine().toUpperCase().replaceAll("[^a-zA-Z]", "");
		int[] arr = new int[26];
		arr['A'-65]=arr['I'-65]=arr['J'-65]=arr['Q'-65]=arr['Y'-65]=1;
		arr['B'-65]=arr['K'-65]=arr['R'-65]=2;
		arr['C'-65]=arr['G'-65]=arr['L'-65]=arr['S'-65]=3;
		arr['D'-65]=arr['M'-65]=arr['T'-65]=4;
		arr['E'-65]=arr['H'-65]=arr['N'-65]=arr['X'-65]=5;
		arr['U'-65]=arr['V'-65]=arr['W'-65]=6;
		arr['O'-65]=arr['Z'-65]=7;
		arr['F'-65]=arr['P'-65]=8;
		int sum=0;
		for(int i=0;i<str.length();i++) {
			int index = (str.charAt(i)-65);
			sum+=arr[index];
		}
		if(sum==9) {
			System.out.println("Output is : 9");
		}else {
			sum=sum%9;
			System.out.println("Output is : "+sum);
		}
		sc.close();
	}

}
