import java.util.Scanner;

public class Main {
	// 달팽이는 올라가고 싶다
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int up = sc.nextInt();	
		int down = sc.nextInt();	
		int length = sc.nextInt();	
		
		int day = (length-down)/(up-down);		
		
		if((length-down)%(up-down) != 0) {
			day++;
		}
		System.out.println(day);
	}

}