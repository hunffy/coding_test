/*  백준 10430번 문제풀이)
    (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
    (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
    세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
 * 
 */
package test_0413;

import java.util.Scanner;

public class test_0413_1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("A,B,C를 차례대로 입력해주세요.");
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        System.out.println((A+B)%C);
        System.out.println(((A%C)+(B%C))%C);
        System.out.println((A*B)%C);
        System.out.println(((A%C)*(B%C))%C);
    }
}
