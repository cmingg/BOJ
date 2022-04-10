import java.util.Scanner;

public class Main {
    // 분수찾기
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int i=1;
        int sum = 0;
        int top = 1, bot = 1;

        while(true) {
            sum += i;
            if(sum >= x) {
                break;
            }
            i++;
        }
        if( i % 2 == 0) {
            for(int j =0; j<=sum-x; j++) {
                top = i-j;
                bot = j+1;
            }
        } else {
            for(int j=0; j<=sum-x; j++) {
                bot = i-j;
                top = j+1;
            }
        }
        System.out.println(top + "/" + bot);
    }
}