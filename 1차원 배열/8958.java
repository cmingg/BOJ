import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	

		int n = sc.nextInt();					// 테스트 개수 입력
		
		String str;								// 문자열 담을 String 선언
		for(int i=0; i<n; i++) {	
			str = sc.next();					// 문자열 입력	
			int score = 0, cnt = 0;
			for(int j=0; j<str.length(); j++) {
				if(str.charAt(j) == 'O') {		// 해당 인덱스 조건 확인
					cnt++;
					score += cnt;
				}else {
					cnt = 0;
				}
			}
			System.out.println(score);
		}
	}
}