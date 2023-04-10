/*  백준 2743번 문제풀이)
 * 단어를 입력받아 단어의 길이를 출력하는 프로그램만들기.
 */
package test_0330;

import java.util.Scanner;

public class test_0330_1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("단어를 입력해주세요.");
        String S = scan.next();
        System.out.print(S.length());
    }
}
