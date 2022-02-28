import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 숫자의 개수
		
		// 1. 자연수 a,b,c 주어짐
		// 2. a*b*c = result 
		// 3. check할 0~9까지의 배열
		// 4. check++
		
		Scanner sc = new Scanner(System.in);	
		
		int a = sc.nextInt();	// 자연수 입력
		int b = sc.nextInt();
		int c = sc.nextInt();
		int result = a*b*c;
		
		int[] check = new int[10];	// 0~9까지 숫자 배열
		
		while(result>0) {
			check[result%10]++;		// 나머지 곧 1의자리 => 위치한 배열 ++
			result /= 10;			// 일의자리 검사후 몫만 저장
		}
		
		for(int i=0; i<check.length; i++) {	// 출력
			System.out.println(check[i]);
		}
	}
}