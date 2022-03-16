import java.util.Scanner;

public class Main {
	// 피보나치 수 5
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();

		System.out.println(fibonacci(n));
	}
	
	// 피보나치 함수
	static int fibonacci(int n) {
		if(n == 0) {
			return 0;
		}else if(n == 1) {
			return 1;
		}else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
		
	}

}
