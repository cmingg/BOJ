import java.util.Scanner;

public class Main {
    // 손익분기점
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();   
        int b = sc.nextInt();   
        int c = sc.nextInt();   
        int result;

        if(b>=c){
            result = -1;
        }else {
            result = a / (c-b) + 1;
        }

        System.out.println(result);

    }

}