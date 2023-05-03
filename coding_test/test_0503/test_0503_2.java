/*  백준 15984번 문제풀이)

    "한 변의 길이가 1인 정사각형을 아래 그림과 같이 겹치지 않게 빈틈없이 계속 붙여 나간다. 
    가장 아랫부분의 정사각형이 n개가 되었을 때, 실선으로 이루어진 도형의 둘레의 길이를 구하시오."
    가장 아랫부분의 정사각형 개수가 주어지면 그에 해당하는 답을 출력하는 프로그램을 만들어 형석이를 도와주자!

    입력)
    첫 번째 줄에 가장 아랫부분의 정사각형 개수 n이 주어진다. (1 ≤ n ≤ 109)

    출력)
    첫 번째 줄에 형석이가 말해야 하는 답을 출력한다.

 * 
 */
package test_0503;

import java.util.Scanner;

public class test_0503_2 {
    public static void main(String[] args){
        System.out.print("정사각형 갯수 n을 입력하세요.");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.print(n*4);
    }
}
