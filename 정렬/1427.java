import java.util.Arrays;
import java.util.Scanner;

public class Main {
    //소트인사이드

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[10];
        int i = 0;

        while (n > 0) {
            arr[i] = n % 10;
            n /= 10;
            i++;
        }
        Arrays.sort(arr);

        for (int j = 9; j > 9 - i; j--) {
            System.out.print(arr[j]);
        }
    }
}
