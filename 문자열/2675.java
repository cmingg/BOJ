import java.util.Scanner;

public class Main {
	// 문자열 반복
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int i=0; i<t; i++) {	
			int r = sc.nextInt();	
			String str = sc.next();
			String newStr = "";		// 새로운 문자열 정리할 newStr
			
			for(int j=0; j<str.length(); j++) {
				for(int k=0; k<r; k++) {
					newStr += str.charAt(j);
				}
			}
			System.out.println(newStr);
		}
	}
}