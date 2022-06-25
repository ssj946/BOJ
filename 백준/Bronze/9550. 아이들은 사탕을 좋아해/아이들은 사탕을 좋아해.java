import java.util.*;

public class Main {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int n, k;
		int sum=0;
		
		for(int i=0; i<t; i++) {
			n = sc.nextInt();
			k = sc.nextInt();		
			int[] s = new int[n];
			
			for(int j=0; j<s.length; j++) {
				s[j] = sc.nextInt();
				s[j]/=k;
				sum +=s[j];
			}
			System.out.println(sum);
			sum=0;
		}
	}

}
