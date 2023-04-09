/*  백준 11005번 문제풀이)
    10진법 수 N을 B진법으로 변환하기.

     10진법 수 N이 주어진다. 이 수를 B진법으로 바꿔 출력하는 프로그램을 작성하시오.
     10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.
     A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35
 */
package test_0407;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test_0407_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("10진법 수 N을 입력하세요.");
        int N = scan.nextInt();
        System.out.print("변환 할 진법B를 입력하세요.");
        int B = scan.nextInt();
        List<Character> list = new ArrayList<>();

        // 입력한 10진법 수 N이 0보다 클때 계속반복되는 while 문이다.
        while(N>0){
            //  1. 나머지가 10보다 작으면 숫자이기때문에 문자'0'을 더해주고 list에 추가시켜준다.
            //    ex) 나머지가 9라면 '0'+9를 해줘서 문자'9'가 list에 추가된다.
            if(N%B<10){
                list.add((char)(N%B+'0'));
            }
            //  2.나머지가 10이상이면 문자이기때문에 10을빼주고 문자 'A'를 더해줘 list에 추가시켜준다.
            //    ex) 나머지가 11이면 11-10+'A' 문자'A'는 숫자10으로 나타낼수있어 11-10+10 = 11 즉 'B'문자가 리스트에 추가된다.
            else{
                list.add((char)(N%B-10+'A'));
            }
            //  3.조건문을 실행시키고 마지막으로 해당하는 진법으로 10진수를 나눠줘 10진수가 0보다 작거나 같아질때까지 반복된다.
            N/=B;
        }
        System.out.print("결과: ");
        for(int i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i));
        }
    }
}
