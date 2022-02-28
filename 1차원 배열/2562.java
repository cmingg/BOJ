import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 1. 9개의 자연수 입력
		// 2. 9개의 배열 생성
		// 3. 첫째줄 최대값찾기
		// 4. 둘째줄 몇번째인지 찾기
		
		Scanner sc = new Scanner(System.in);	
		
		int[] array = new int[9];	// 9개정수배열
		int max = 0;	// 최대값, 위치 
		int index = 0;	 
		
		for(int i=0; i<array.length; i++) {	
			array[i] = sc.nextInt();	// 배열 값 초기화
		}
	
		for(int i=0; i<array.length; i++) {
			if(array[i]>max) {
				max = array[i];
				index = i;
			}
		}
		
		System.out.println(max);
		System.out.println(index+1);
	}
}