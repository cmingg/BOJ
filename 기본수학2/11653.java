import java.util.Scanner;

public class Main {
    //소인수분해
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 2;
        while(true) {
            if(n == 1)
                break;
            if(n % i == 0) {
                n /= i;
                System.out.println(i);
            } else {
                i++;
            }
        }
    }
}