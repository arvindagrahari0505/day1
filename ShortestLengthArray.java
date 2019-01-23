
public class ShortestLengthArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = new int[][] {{1,2,3,4},{0,2,7},{4,12},{1,2,5,6}};
		
		int min = Integer.MAX_VALUE;
		int index=0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(min>arr[i].length) {
				min=arr[i].length;
				index=i;
			}
		}
		System.out.print("Output : ");
		for(int i=0;i<arr[index].length;i++) {
			System.out.print(arr[index][i]+" ");
		}
		System.out.println("Length : "+min);
	}

}
