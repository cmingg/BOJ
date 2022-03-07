import java.util.Scanner;

public class Main {
	// 알파벳 찾기
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[26];	
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = -1;
		}
		
		String s = sc.next();
		
		for(int i=0; i<s.length(); i++) {	
			char ch = s.charAt(i);
			
			if(arr[ch-'a'] == -1) {
				arr[ch-'a'] = i;
			}
		}
		
		for(int i : arr) {
			System.out.println(i);
		}
	}
}