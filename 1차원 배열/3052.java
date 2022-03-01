import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 1. 나머지 값들의 배열 
		// 2. 자연수 10개 입력
		// 3. 서로 다른 값 몇개 있는지 count
		
		Scanner sc = new Scanner(System.in);	
		
		int[] array = new int[10];	// 10개 정수배열
		int count = 0; 
		
		for(int i=0; i<array.length; i++) {	
			array[i] = sc.nextInt()%42;	// 애초에 나눈값 배열에 입력
		}
	
		for(int i=0; i<array.length; i++) {
			int check = 0;
			for(int j=i+1; j<array.length; j++) {
				if(array[i]==array[j]) {	// 중복확인
					check++;
				}
			}
				if(check == 0) {
					count++;
				}
			}
		System.out.println(count);
	}
}