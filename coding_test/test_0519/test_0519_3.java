/*  백준 11650번 문제풀이)

    2차원 평면 위의 점 N개가 주어진다. 좌표를 x좌표가 증가하는 순으로, x좌표가 같으면 y좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.

    입력)
    첫째 줄에 점의 개수 N (1 ≤ N ≤ 100,000)이 주어진다. 둘째 줄부터 N개의 줄에는 i번점의 위치 xi와 yi가 주어진다. 
    (-100,000 ≤ xi, yi ≤ 100,000) 좌표는 항상 정수이고, 위치가 같은 두 점은 없다.

    출력)
    첫째 줄부터 N개의 줄에 점을 정렬한 결과를 출력한다.
 * 
 */
package test_0519;

import java.util.Arrays;
import java.util.Scanner;

public class test_0519_3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("좌표의 갯수 입력");
        int N = scan.nextInt();
        int [][] xy = new int [N][2];

        for(int i=0; i<N; i++){
            System.out.println("좌표값 입력");
            xy[i][0]=scan.nextInt();
            xy[i][1]=scan.nextInt();
        }

        //e1[0]은 첫번째 x의 좌표값 , e2[0]은 두번째 x의 좌표값
        //e1[1]은 첫번째 y의 좌표값 , e2[1]은 두번째 y의 좌표값
        Arrays.sort(xy,(xy1,xy2)->{
            //x값이 같은경우 y값을 비교한다
            if(xy1[0]==xy2[0]){
                //두개의 좌표를 빼서 음수면 그대로, 양수면 위치를 바꿔준다.
                return xy1[1]-xy2[1];
            //x값이 같지않은경우 x값을 비교해준다.
            }else{
                //마찬가지로 두개의 좌표를 빼서 음수면 그대로, 양수면 위치를 바꿔준다.
                return xy1[0]-xy2[0];
            }
        });
        for(int i=0; i<N; i++){
            System.out.println(xy[i][0]+" "+xy[i][1]);
        }
    }    
}
