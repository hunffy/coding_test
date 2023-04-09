/*  백준 2745 문제 풀이)
    B진법 수 N이 주어진다. 이 수를 10진법으로 바꿔 출력하는 프로그램을 작성하시오.
    10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.
    A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35
 * 
 */
package test_0406;

import java.util.Scanner;

public class test_0406_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ans = 0;
        System.out.println("수 N을 입력하세요.");
        String N = scan.next();
        System.out.println("진법 B를 입력해주세요.");
        int B = scan.nextInt();
        for(int i=0; i<N.length(); i++) {
            //입력값이 0~9사이일때
            //N.charAt(i)는 문자이기때문에 '0'~'9'일때는 '0'을뺴줘서 숫자로표현, 출력해준다.
            if('0' <= N.charAt(i) && '9'>=N.charAt(i))
                ans = ans*B+(N.charAt(i)-'0');
            //입력값이 A~Z일때 문자 'Z'의 값을 숫자료 표현하기위해 문자'A'를 빼주고 10을 더해준다.
            else
                ans = ans*B+(N.charAt(i)-'A'+10);
        }
        System.out.println(N+"의 10진법 결과:"+ans);
    }
}
