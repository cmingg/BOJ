import java.util.Scanner;

public class Main {
    // 직각삼각형
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int arr[] = new int[3];

            int tmp;
            for(int i=0; i<3; i++){
                arr[i] = sc.nextInt();
            }
            if(arr[0] == 0 && arr[1] == 0 && arr[2] == 0)
                break;
            for(int i=1; i<3; i++){     // 빗변
                if(arr[i-1] > arr[i]){
                    tmp = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = tmp;
                }
            }
            if((arr[0]*arr[0]) + (arr[1]*arr[1]) == (arr[2]*arr[2])) {
                System.out.println("right");
            }else {
                System.out.println("wrong");
            }
        }

    }
}