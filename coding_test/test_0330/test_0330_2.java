/*
 * 문자열을 입력시 첫글자와 마지막글자를 출력해주는 프로그램만들기.
 */
package test_0330;

import java.util.Scanner;

public class test_0330_2 {
   public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("문자를 입력해주세요");
    String [] S = scan.next().split("");
    System.out.print("첫글자:"+S[0]+"마지막글자"+S[S.length-1]);
   } 
}
