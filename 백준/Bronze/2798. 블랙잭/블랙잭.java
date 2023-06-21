import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        
        ArrayList <Integer> N_list = new ArrayList<>();
        for(int i=0; i<N; i++){
            N_list.add(scan.nextInt());
        }
        int hap = 0;
        int maxHap=0;
        
        for(int i=0; i<N-2; i++){
            for(int j=i+1; j<N-1; j++){
                for(int k=j+1; k<N; k++){
                    hap = N_list.get(i)+N_list.get(j)+N_list.get(k);
                    if(hap<=M && hap>maxHap){
                        maxHap = hap;
                    }
                }
            }
        }
        System.out.print(maxHap);
    }
}