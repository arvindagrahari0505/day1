
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=1000;i++) {
			int len = Integer.toString(i).length();
			int temp=i;
			int sum=0;
			while(temp!=0) {
				int m=temp%10;
				sum+=(int)Math.pow(m, len);
				temp/=10;
			}
			if(sum==i) {
				System.out.print(i+" ");
			}
		}
	}

}
