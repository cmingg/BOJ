import java.util.Scanner;

public class Main {
// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();	// 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
		
		for(int i=1; i<=t; i++) {	// test수만큼 반복
			
			int a = sc.nextInt();	
			int b = sc.nextInt();	// 2개 정수 입력받기
			
			System.out.println("Case #"+i+":"+" "+a+" + "+b+" = "+(a+b));
		}
	}
}