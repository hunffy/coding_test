/*  백준 25305번 문제풀이)
    2022 연세대학교 미래캠퍼스 슬기로운 코딩생활에 
    N명의 학생들이 응시했다.

    이들 중 점수가 가장 높은 
    k명은 상을 받을 것이다. 이 때, 상을 받는 커트라인이 몇 점인지 구하라.

    커트라인이란 상을 받는 사람들 중 점수가 가장 가장 낮은 사람의 점수를 말한다.

    입력)
    첫째 줄에는 응시자의 수 N과 상을 받는 사람의 수 k가 공백을 사이에 두고 주어진다.
    둘째 줄에는 각 학생의 점수 x가 공백을 사이에 두고 주어진다.

    출력)
    상을 받는 커트라인을 출력하라.
 * 
 */
package test_0518;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class test_0518_2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("응시자수 N과 수상자 수 K를 입력하세요");
        int N = scan.nextInt();
        int k = scan.nextInt();

        int [] N_list = new int[N];
        for(int i=0; i<N; i++){
            System.out.println("점수를 입력하세요");
            N_list[i]=scan.nextInt();
        }
        //현재 오름차순상태.
        //ex) N=5, k=2일때 50 60 70 80 90 이런식으로 정렬되어있다고치자.
        Arrays.sort(N_list);
        //ex) N-K 5-2인 값 3 N_list[3]은 80이 나온다.
        // 현재 오름차순정렬이기때문에  총 인원인 N에서 커트라인 수 K를 빼면 커트라인인 점수를 얻을수있다.
        System.out.print(N_list[N-k]);
    }
}
