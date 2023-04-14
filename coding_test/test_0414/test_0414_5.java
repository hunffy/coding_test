/*  백준 10871번 문제풀이)
 *  정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
 * 
 *  입력) 
 *  첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
    둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.

    출력)
    X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.
 */
package test_0414;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class test_0414_5 {
    public static void main(String[] args) throws NumberFormatException,IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("숫자 갯수 N을 입력하세요.");
        int N = Integer.parseInt(br.readLine());
        System.out.println("기준이되는 숫자를 입력하세요.");
        int X = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<N; i++){
            System.out.print(N+"개만큼 숫자를 입력하세요.");
            int A = Integer.parseInt(br.readLine());
            if(A<X){
                list.add(A);
            }
        }
        System.out.print(list);
    }
}
