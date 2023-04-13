/*  백준 2588번 문제풀이)
 *  3자리수 X 3자리수 식이 주어졌을때
 *  
 *  ex)               472  ...(1)
 *                   x385  ...(2)
 *          ㅡㅡㅡㅡㅡㅡㅡ
 *                    2360 ...(3)
 *                   3776  ...(4)
 *                  1416   ...(5)
 *          ㅡㅡㅡㅡㅡㅡㅡ
 *                 181720  ...(6)
 * 
 *       (1),(2) 가 주어졌을때, 
 *      (3),(4),(5),(6) 차례대로 출력되는 프로그램 만들기.
 */
package test_0413;

import java.util.Scanner;

public class test_0413_3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("자연수 N과 N2를 입력하세요.");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = (b%10)*a;
        int d = ((b%100)/10)*a;
        int e = (b/100)*a;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(a*b);
    }
}
