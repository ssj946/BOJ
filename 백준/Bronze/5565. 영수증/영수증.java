import java.util.*;

public class Main {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		int sum = sc.nextInt();
		int[] arr = new int[9];
		
		for(int i=0; i<9; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<9; i++) {
			sum-=arr[i];
		}
		
		System.out.println(sum);
		
	}

}
