/*  백준 11651번 문제풀이)

    2차원 평면 위의 점 N개가 주어진다. 좌표를 y좌표가 증가하는 순으로, y좌표가 같으면 x좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.

    입력)
    첫째 줄에 점의 개수 N (1 ≤ N ≤ 100,000)이 주어진다. 
    둘째 줄부터 N개의 줄에는 i번점의 위치 xi와 yi가 주어진다. 
    (-100,000 ≤ xi, yi ≤ 100,000) 좌표는 항상 정수이고, 위치가 같은 두 점은 없다.

    출력)
    첫째 줄부터 N개의 줄에 점을 정렬한 결과를 출력한다.
 * 
 */
package test_0520;

import java.util.Arrays;
import java.util.Scanner;

public class test_0520_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("좌표의 갯수 N을 입력하세요");
        int N = in.nextInt();

        int [][] xy = new int [N][2];

        for(int i=0; i<N; i++){
            System.out.println(i+"번쨰 x좌표값을 입력하세요.");
            xy[i][0]=in.nextInt();
            System.out.println(i+"번째 y좌표값을 입력하세요.");
            xy[i][1]=in.nextInt();
        }

        Arrays.sort(xy,(xy1,xy2)->{
            if(xy1[1]==xy2[1]){
                return xy1[0]-xy2[0];
            }else{
                return xy1[1]-xy2[1];
            }
        });
        for(int i=0; i<N; i++){
            System.out.println(xy[i][0]+" "+xy[i][1]);
        }
    }
}
