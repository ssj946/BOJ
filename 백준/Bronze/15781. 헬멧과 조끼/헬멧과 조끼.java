import java.util.*;

public class Main {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] h = new int[n];
		int[] a = new int[m];
		
		for(int i=0; i<n; i++) {
			h[i] = sc.nextInt();
		}
		Arrays.sort(h);
		
		for(int i=0; i<m; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		
		int sum=0;
		sum = h[h.length-1]+a[a.length-1];
		
		System.out.println(sum);
		
	}

}
