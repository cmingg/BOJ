import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();	// 조리시간

		b += c;	// 현재분 + 조리시간
		
		if(b >= 60) {
			a += b / 60;	// a에 b랑 60 나눈거의 몫만큼 더한다
			b = b % 60;
		}
			if(a == 24) {
				a = 0;
			}else if(a > 24) {
				a -= 24;
			}
		System.out.printf("%d %d", a, b);
	}
}