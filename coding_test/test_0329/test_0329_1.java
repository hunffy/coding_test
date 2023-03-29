/*
 *  단어 S와 정수 I가 주어졌을 때, S의 I번째 글자를 출력하는 프로그램 만들기.

    S = input("단어를 입력하세요.")
    I = int(input("몇번째 글자를 출력할까요?"))
 */
package test_0329;

import java.util.Scanner;

public class test_0329_1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("단어를 입력하세요.");
        String [] S = scan.next().split("");
        System.out.print("몇번째 글자를 출력할까요?"); 
        int I = scan.nextInt();

        System.out.print(S[I-1]);
    }
    
}
