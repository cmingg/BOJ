import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();	
		
		for(int i=0; i<n; i++) {		// n만큼 별 찍기	
			for(int j=n; j>i+1; j--) {		// 공백 출력
				System.out.print(" ");
			}
			for(int k=0; k<i+1; k++) {	// * 출력
				System.out.print("*");
			}		
			 System.out.println();
		}
	}
}