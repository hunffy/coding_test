/* 백준 9086번 문제풀이)
 * 문자열을 입력시 첫글자와 마지막글자를 출력해주는 프로그램만들기.
 */
package test_0330;

import java.util.Scanner;

public class test_0330_2 {
   public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("테스트 수 T를 입력하세요.");
    int T =scan.nextInt();
    for(int i=0; i<T; i++){
    System.out.println("문자를 입력해주세요");
    String [] S = scan.next().split("");
    System.out.println("첫글자:"+S[0]+"마지막글자"+S[S.length-1]);
    System.out.println();
    }
   } 
}
