import java.util.Scanner;

public class Main {
// n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();	// n이 주어짐
		int sum = 0;	// 합
		
		if(n>=1 && n<=10000) {
			for(int i=1; i<=n; i++) {
				sum += i;
			}
			System.out.println(sum);
		}
	}
}