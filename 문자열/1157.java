import java.util.Scanner;

public class Main {
	// 단어공부
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[26]; // 알파벳 공간
		String s = sc.next();
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)>=65 && s.charAt(i)<=90) {	// 대문자
				arr[s.charAt(i)-65]++;
			}else {
				arr[s.charAt(i)-97]++; // 소문자
			}
		}
		
		int max = -1;
		char ch = '?';
		
		for(int j=0; j<arr.length; j++) {
			if(max<arr[j]) {
				max = arr[j];
				ch = (char)(j+65);	// 대문자로 출력
			}else if(max == arr[j]) {
				ch = '?';
			}
		}
		System.out.println(ch);
	}
}