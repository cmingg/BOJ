import java.util.Scanner;

// 벌집
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int range = 1;
        int count = 1;
        int tmp = 1;

        while (true) {
            if (range >= n) {
                break;
            }
            tmp = 6 * (count++);
            range += tmp;
        }
        System.out.println(count);
    }
}