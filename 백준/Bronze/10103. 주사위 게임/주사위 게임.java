import java.util.*;

public class Main {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int csum = 100;
		int jsum = 100;
		
		for(int i=0; i<n; i++) {
			int chang = sc.nextInt();
			int jeung = sc.nextInt();
			
			if(chang>jeung) {
				jsum -= chang;
			}
			else if(jeung>chang) {
				csum -= jeung;
			}
		}
		
		System.out.println(csum);
		System.out.println(jsum);
		
	}

}
