import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H,M;
		
		H = sc.nextInt();
		M = sc.nextInt();
		
		M -= 45; // 45분 일찍
		
		if(M<0) {
			H -= 1;
			if(H<0) {
				H += 24;
			}
			M += 60;
		}
		System.out.printf("%d %d", H, M);
	}
}