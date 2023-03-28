/* 
    N개의 정수가 주어질때, 최솟값과 최댓값을 구하는 프로그램 만들기.

 1. 첫째 줄에 정수의 갯수 N이 주어진다.
 2. 둘째 줄에 N개의 정수를 공백으루 구분하여 주어진다.
 
 */
package test_0328;

import java.util.Arrays;
import java.util.Scanner;

public class test_0328_2 {
    public static void main(String[] args){
        int imax = 0;
        int imin = 999999;
        System.out.print("정수의 갯수 N을 입력하세요.");
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        int [] N_list = new int[N];
        for(int i=0; i<N; i++){
            System.out.print("N2를 입력해주세요.");
            N_list[i] = scan.nextInt();
        }
        //Arrays.sort를 이용하여 배열이 정렬된다. 최솟값,....,최댓값
        Arrays.sort(N_list);
        System.out.print("최솟값:"+N_list[0]+"최댓값:"+N_list[N-1]);
    }
}
