/*  백준 11653번 문제풀이)
    
    정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오.

    입력)
    첫째 줄에 정수 N (1 ≤ N ≤ 10,000,000)이 주어진다.

    출력)
    N의 소인수분해 결과를 한 줄에 하나씩 오름차순으로 출력한다. N이 1인 경우 아무것도 출력하지 않는다.

    예제입력)
    72

    예제출력)
    2
    2
    2
    3
    3
 * 
 */
package test_0427;

import java.util.ArrayList;
import java.util.Scanner;

public class test_0427_3 {
        public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int i = 2;
        while(N!=1){ // N이 1이되면 종료
            if(N%i==0){ // N을 나눠서 나머지가0이면 해당 i를 출력시키고, N은 i로 나눈 몫으로 수정. ex) N입력값:72 , 72/2 => 36   2출력 N=36.
                System.out.println(i);
                N/=i;
            //i로 나누어 0이되지않는다면 i를 1씩증가.
            }else{
                i++;
            }
        }
    }
}
