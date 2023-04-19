/*  평균구하기
*/
package test_0417;

import java.util.Scanner;

public class test_0417_2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        double sum = 0.0;

        int [] N_list = new int[N]; 
        for(int i=0; i<N; i++){
            N_list[i] = scan.nextInt();
        }
        for(double num:N_list){
            sum+=num;
        }
        System.out.print(sum/N);
    }
}
