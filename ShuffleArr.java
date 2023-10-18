import java.util.*;
public class ShuffleArr {
	public static void shuffle(int[] arr) {
		int len=arr.length;
		Random rand=new Random();
	
		for(int i=0;i<len;i++) {
			int randomIndex = rand.nextInt(len);
			int temp=arr[i];
			arr[i]=arr[randomIndex];
			arr[randomIndex]=temp;
			
		}
	}

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		
		shuffle(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
