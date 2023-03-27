/* 두 정수 A와 B를 입력받아,
   A+B를 출력하는 프로그램 만들기.
 
 */
package test_0327;

import java.util.Scanner;

public class test_0327_6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("A값을 입력해주세요.");
        int A = scan.nextInt();
        System.out.println("B값을 입력해주세요.");
        int B = scan.nextInt();
        System.out.print("A+B="+(A+B));
    }
}
