/*  백준 11382번 문제풀이)
 *  꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 이제 A + B + C를 계산할 차례이다!
 *  
 *  입력) 첫 번째 줄에 A, B, C (1 ≤ A, B, C ≤ 1012)이 공백을 사이에 두고 주어진다.
 *  출력) A+B+C의 값을 출력한다.  
 */

package test_0413;

import java.util.Scanner;

public class test_0413_4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("1 ≤ A, B, C ≤ 1012 A,B,C값을 입력해주세요");
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();

        System.out.print(A+B+C);
    }
}
