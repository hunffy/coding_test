/*  백준 27323번 문제풀이)

    정수 A, B 가 주어진다. 세로 길이가 A cm, 가로 길이가 B cm 인 아래와 같은 
    직사각형의 넓이를 cm2 단위로 구하시오.


 * 
 */
package test_0427;

import java.util.Scanner;

public class test_0427_4 {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    System.out.println("정수 A와 B를 입력하세요. A=세로, B=가로");

    int A = scan.nextInt();
    int B = scan.nextInt();

    System.out.println(A*B);

    }
}
