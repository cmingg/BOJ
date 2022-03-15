import java.util.Scanner;
/*
 *  EOF (End Of File) : 최대 몇개의 입력이 들어오는지 모르는 문제에서 사용 
 *                    : 보통 while과 함께 사용
 */
public class Main {
	// A+B - 4 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 사용자가 입력을 할 때가지 실행을 기다렸다가 입력이 일어나면 true/false를 확인하고 반복문이 동작
		while(sc.hasNext()) {  
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
		}
	}

}