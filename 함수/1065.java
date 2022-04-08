import java.util.Scanner;

public class Main{

    static int hanNum(int n) {
        int count = 0;

        for(int i=1; i<=n; i++) {
            if(i<100) { // 100아래 두 자리는 모두 한수이다
                count++;
            }else if(i<=1000) {
                String s = String.valueOf(i);
                int sub = s.charAt(1) - s.charAt(0);
                int sub2 = s.charAt(2) - s.charAt(1);
                if(sub == sub2){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(hanNum(n));
    }
}