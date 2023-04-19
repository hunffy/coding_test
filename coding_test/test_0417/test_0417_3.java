/*  백준 11654번 문제풀이)
    알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.

    입력)
    알파벳 소문자, 대문자, 숫자 0-9 중 하나가 첫째 줄에 주어진다.

    출력)
    입력으로 주어진 글자의 아스키 코드 값을 출력한다.   
 * 
 */
package test_0417;

import java.util.Scanner;

public class test_0417_3 {
    public static void main(String[] args) throws Exception{
     System.out.print("아스키코드로 변환 할 문자 또는 숫자를 입력하세요. ");
     int N = System.in.read();
     System.out.print(N);
    }
}

