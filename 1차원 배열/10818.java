import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 1. 첫번째 줄 n개의 정수 주어짐
		// 2. n개의 배열 생성
		// 3. 두번째 줄 n개의 정수 입력
		// 4. 배열에 값 입력
		// 5. Arrays.sort 정렬
		
		Scanner sc = new Scanner(System.in);	
		
		int n = sc.nextInt();	// n개의 정수
		
		int[] array = new int[n];	// 배열 생성
		
		for(int i=0; i<array.length; i++) {	
			array[i] = sc.nextInt();	// 배열에 들어갈 값
		}
		
		Arrays.sort(array);	// 정렬
		
		System.out.println(array[0] + " " + array[array.length-1]);	// 최소값, 최대값
	}
}