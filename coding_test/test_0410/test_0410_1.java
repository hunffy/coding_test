/* 백준 9498번 문제풀이)
 * 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 
 * 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
 */
package test_0410;

import java.util.Scanner;

public class test_0410_1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("점수를 입력하세요.");
        int N = scan.nextInt();

        if(N>89){
            System.out.print("A");
        }else if(N>79 && N<90){
            System.out.print("B");
        }else if(N>69 && N<80){
            System.out.print("C");
        }else if(N>59 && N<70){
            System.out.print("D");
        }else{
            System.out.print("F");
        }
    }
}
