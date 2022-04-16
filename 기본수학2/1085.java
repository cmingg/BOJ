import java.util.Scanner;

public class Main {
    //직사각형에서 탈출
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        
        int widMin = (x-y) < x ? (w-x) : x;
        int heiMin = (h-y) < y ? (h-y) : y;
        
        if (widMin < heiMin) {
            System.out.println(widMin);
        } else {
            System.out.println(heiMin);
        }
    }
}