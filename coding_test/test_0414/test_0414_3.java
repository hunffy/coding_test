
/*  백준 11021번 문제풀이)
    두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
    첫째 줄에 테스트 케이스의 개수 T가 주어진다.
    각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 
 */
package test_0414;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_0414_3 {
    public static void main(String[] args)throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("테스트 수 T를 입력하세요");
        int T = Integer.parseInt(br.readLine());

        for(int i=1; i<=T; i++){
            System.out.println("A와 B를 입력하세요.");
            int A = Integer.parseInt(br.readLine());
            int B = Integer.parseInt(br.readLine());
            System.out.println("Case #"+i+" :"+(A+B));
        }
    }
}
