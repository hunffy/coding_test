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
        System.out.print("자연수 a와 b를 입력하세요.");
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        //b%10 을 통해 b를 10으로 나누고 남은 나머지 즉 1의자리숫자만 남고 그 수를 a와 곱해준다.
        int c = (b%10)*a;

        //b를 100으로 나눈나머지 85.  85를다시 10으로 나눈 몫 8  십의자리*a를 해주었다.
        int d = ((b%100)/10)*a;

        //b를 100으로 나눈 몫 즉 b의 백의자리 3.  백의자리*a를 해준다.
        int e = (b/100)*a;


        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        //마지막으론 a와 b의 정상적인 곱셈식을 처리해준다.
        System.out.println(a*b);
    }
}
