import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double [] num = new double[n];
        for(int i=0; i<n; i++){
            num[i]=in.nextInt();
        }
        double max = 0;
        for(int i=0; i<n; i++){
            if(num[i]>max){
                max = num[i];
            }
        }
        
        double sum = 0;
        for(int i=0; i<n; i++){
            sum += num[i]*100/max;
        }
        double avg = (double)sum/n;
        System.out.print(avg);
    }
}