import java.util.*;

public class Main {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(c<=b) {
			System.out.println(-1);
		}
		else {
			int total = (a/(c-b))+1;
			System.out.println(total);
		}
		
		
	}

}
