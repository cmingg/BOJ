import java.util.Scanner;

public class Main {
// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();	// test 수	
		
		for(int i=0; i<t; i++) { // test수 만큼 반복
			int a = sc.nextInt();	
			int b = sc.nextInt();	// 정수 2개 받기
			System.out.println(a+b);
		}
	}
}