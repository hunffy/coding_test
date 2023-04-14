package test_0414;

import java.util.Scanner;

public class test_0414_1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("정수 N을 입력하세요.");
        int N = scan.nextInt();
        String L = "";
        for(int i=0; i<N/4; i++){
            L +="long ";
        }
        System.out.print(L+" int");
    }
}
