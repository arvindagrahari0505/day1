
public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=100;i++) {
			int sum=0;
			for(int j=1;j<=i/2;j++) {
				if(i%j==0) {
					sum+=j;
				}
			}
			if(sum==i) {
				System.out.println(sum);
			}
		}
	}

}
