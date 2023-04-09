package test_0409;

import java.util.Scanner;

public class test_0409_2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("과정 횟수 N을 입력하세요.  \n N :");
        int N = scan.nextInt();
        int ans = 0;
        int res = 2;
        for(int i=0; i<N; i++){
            ans = (int) Math.pow(2, i);
            res += ans;
        }
        System.out.println("결과 :"+res*res);
    }
}
