import java.util.Scanner;

public class Main {
// 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	
		int x = sc.nextInt();	// 첫째 줄에 n과 x가 주어진다
		
		int[] a = new int[n];	// n개로 이뤄진 수열 a
		
		for(int i=0; i<a.length; i++) {		// 둘째줄에 수열 a를 이루는 정수 n개가 주어진다 	
			a[i] = sc.nextInt();
			if(a[i] < x) {
				System.out.print(a[i]);
				System.out.print(" ");
			}
		}
	}
}