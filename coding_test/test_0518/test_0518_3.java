package test_0518;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/*  백준 2751번 문제풀이)
    N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

    입력)
    첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다. 
    이 수는 절댓값이 1,000,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.

    출력)
    첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
 * 
 */
public class test_0518_3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.println("숫자의 갯수 입력");
        int N = scan.nextInt();
        ArrayList <Integer> N_list = new ArrayList<>();

        for(int i=0; i<N; i++){
            N_list.add(scan.nextInt());
        }

        Collections.sort(N_list);

        for(Integer c : N_list){
            sb.append(c).append("\n");
        }
        System.out.println(sb);
    }
}
