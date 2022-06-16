import java.util.*;

public class Main {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double sum=0;
		
		double[] arr = new double[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextDouble();
		}
		Arrays.sort(arr);
		
		for(int i=0; i<n; i++) {
			sum += arr[i]/arr[n-1]*100;
		}
		
		double avg = sum/n;
		
		System.out.println(avg);

	}

}
