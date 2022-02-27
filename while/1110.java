import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        if(n<10)
            n *= 10;
    
        int left, right, cnt = 0, sum = n;
 
        while(true) {
            left = sum / 10;
            right = sum % 10;
            sum = left + right;
            
            sum = right * 10 + sum % 10;
            cnt++;
            if(sum == n)
                break;
        }
        System.out.println(cnt);
    }
}
