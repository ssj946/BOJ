import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int total = 0;
		
		if(a==b&&b==c) {
			total = 10000+b*1000;
		}
		else if(a==b||b==c) {
			total = 1000+b*100;
		}
		else if(a==c) {
			total = 1000+a*100;
		}
		else
			total = Math.max(a, Math.max(b, c))*100;
		
		System.out.println(total);
		
		
		sc.close();
	}

}
