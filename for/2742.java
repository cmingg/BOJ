import java.util.Scanner;

public class Main {
// 자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	// 자연수n
		
		for(int i=n; i>=1; i--) { 
			System.out.println(i);
		}
	}
}