import java.util.Scanner;

public class Main {
	// 다이얼
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next().toUpperCase();
		int sum = 0; 
		
		for(int i=0; i<s.length(); i++) {
			char dial = s.charAt(i);
			
			if(dial >= 'A' && dial <= 'C') {
				sum += 3;
			}else if(dial >= 'D' && dial <= 'F') {
				sum += 4;
			}else if(dial >= 'G' && dial <= 'I') {
				sum += 5;
			}else if(dial >= 'J' && dial <= 'L') {
				sum += 6;
			}else if(dial >= 'M' && dial <= 'O') {
				sum += 7;
			}else if(dial >= 'P' && dial <= 'S') {
				sum += 8;
			}else if(dial >= 'T' && dial <= 'V') {
				sum += 9;
			}else if(dial >= 'W' && dial <= 'Z') {
				sum += 10;
			}
		}
		System.out.println(sum);
	
	}
}