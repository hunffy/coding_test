package test_0409;

import java.util.Scanner;

public class test_0409_1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("테스트 수 T를 입력해주세요.");
        int T = scan.nextInt();
        for(int i=0; i<T; i++){
            System.out.println("거스름돈 C를 입력해주세요.");
            int C = scan.nextInt();
            System.out.print(C/25+" ");
            System.out.print(C%25/10+" ");
            System.out.print(C%25%10/5+" ");
            System.out.println(C%25%10%5/1+" ");
        }
    }
}
