import java.util.Scanner;

public class Main {
	// 단어의 개수 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		int count = 0; 
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch == ' ') {
				count++;
			}
		}
		if(s.charAt(0) == ' ') {
			count -= 1;
		}
		if(s.charAt(s.length()-1) == ' '){ // 배열의 마지막 요소의 인덱스는 (배열의 크기 - 1)이다.
			count -= 1; 
		}
		
		System.out.println(count+1);

	}
}


