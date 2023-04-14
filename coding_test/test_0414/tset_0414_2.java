/*  백준 15552번 문제풀이)
 *  Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다.
 *  BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.
 */
package test_0414;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tset_0414_2 {
    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("테스트 케이스 수 T를 입력하세요.");
        int T = Integer.parseInt(br.readLine());
        
        for(int i=0; i<T; i++){
        System.out.println("정수 A와 B를 입력하세요.");
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        System.out.println("결과 :"+(A+B));
    }
    }
}
