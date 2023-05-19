/*  백준 10989번 문제풀이)

    N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

    입력)
    첫째 줄에 수의 개수 N(1 ≤ N ≤ 10,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다. 이 수는 10,000보다 작거나 같은 자연수이다.

    출력)
    첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
 * 
 */
package test_0519;

import java.util.Arrays;
import java.util.Scanner;

public class test_0519_1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자갯수를 입력하세요");
        int N = scan.nextInt();
        int[] N_list = new int[N];

        for(int i=0; i<N; i++){
            System.out.println("숫자를 입력하세요");
            N_list[i]=scan.nextInt();
        }
        Arrays.sort(N_list);

        for(int i=0; i<N; i++){
            System.out.println(N_list[i]);
        }
    }
}
