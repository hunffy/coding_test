/*  백준 2903문제 풀이)
 * 상근이는 친구들과 함께 SF영화를 찍으려고 한다. 이 영화는 외계 지형이 필요하다. 
 * 실제로 우주선을 타고 외계 행성에 가서 촬영을 할 수 없기 때문에, 컴퓨터 그래픽으로 CG처리를 하려고 한다.
    외계 지형은 중앙 이동 알고리즘을 이용해서 만들려고 한다.
    알고리즘을 시작하면서 상근이는 정사각형을 이루는 점 4개를 고른다. 그 후에는 다음과 같은 과정을 거쳐서 지형을 만든다.
    정사각형의 각 변의 중앙에 점을 하나 추가한다.
    정사각형의 중심에 점을 하나 추가한다.
    초기 상태에서 위와 같은 과정을 한 번 거치면 총 4개의 정사각형이 새로 생긴다. 이와 같은 과정을 상근이가 만족할 때 까지 계속한다.


 */
package test_0409;

import java.util.Scanner;

public class test_0409_2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("과정 횟수 N을 입력하세요.  \n N :");
        int N = scan.nextInt();
        int ans = 0;
        int res = 2;
        for(int i=0; i<N; i++){
            ans = (int) Math.pow(2, i);
            res += ans;
        }
        System.out.println("결과 :"+res*res);
    }
}
