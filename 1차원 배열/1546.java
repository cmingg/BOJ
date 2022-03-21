import java.util.Scanner;

public class Main {
    // 평균
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   

        double[] scores = new double[n];
        int max = 0;
        double sum = 0, maxScore;

        for(int i=0; i<n; i++){     
            scores[i] = sc.nextInt();
            if(scores[max] < scores[i]) {
                max = i;
            }
        }

        maxScore = scores[max];

        for(int j=0; j< scores.length; j++){    
            scores[j] = scores[j]/maxScore*100;
            sum += scores[j];
        }
        System.out.println(sum/n);
    }

}
