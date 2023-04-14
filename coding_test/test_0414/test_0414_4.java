/*  백준 11022번 문제풀이)
 *  첫째 줄에 테스트 케이스의 개수 T가 주어진다.
    각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
    
    각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다. x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.
    */
package test_0414;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_0414_4 {
    public static void main(String[] args) throws NumberFormatException,IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("테스트 수 T를 입력하세요.");
        int T = Integer.parseInt(br.readLine());

        for(int i=1; i<=T; i++){
            System.out.println("A와 B를 입력하세요.");
            int A = Integer.parseInt(br.readLine());
            int B = Integer.parseInt(br.readLine());
            System.out.println("Case #"+i+" : "+A+" + "+B+" = "+(A+B));
        }
    }
}
