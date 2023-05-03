/*  백준 3009번 문제풀이)
    세 점이 주어졌을 때, 축에 평행한 직사각형을 만들기 위해서 필요한 네 번째 점을 찾는 프로그램을 작성하시오.

    입력)
    세 점의 좌표가 한 줄에 하나씩 주어진다. 좌표는 1보다 크거나 같고, 1000보다 작거나 같은 정수이다.

    출력)
    직사각형의 네 번째 점의 좌표를 출력한다.


 * 
 */
package test_0503;

import java.util.Scanner;

public class test_0503_1 {
    public static void main(String[] args){
        System.out.print("직사각형의 3개의 좌표를 입력하세요.");
        Scanner scan = new Scanner(System.in);
        int [] G1 = {scan.nextInt(), scan.nextInt()};
        int [] G2 = {scan.nextInt(), scan.nextInt()};
        int [] G3 = {scan.nextInt(), scan.nextInt()};
        int X = 0;
        int Y = 0;
        
        /* ex) 입력된 좌표가 (5,5), (5,7), (7,5) 라면
                (7,7)이 출력되어야 한다.
                직사각형이라면 x축과 y축의 값은 각각 2개씩 존재해야하기때문에
                2개씩 존재하고있는 5를 제외한

                x축 7 y축 7 이 출력되어야 정답이다.
         * 
         */
        //(5,5) (5,7) (7,5) 입력시 이부분이 해당되어
        //G3[0] = 즉 G3의 x축값 7이 네번째 좌표의 x값이된다.
        if(G1[0]==G2[0]){
            X=G3[0];
        }else if(G1[0]==G3[0]){
            X=G2[0];
        }else{
            X=G1[0];
        }
        if(G1[1]==G2[1]){
            Y=G3[1];
        //(5,5) (5,7) (7,5) 입력시 이부분이 해당되어
        //G2[1] = 즉 G2의 y축값 7이 네번째 좌표의 y값이된다.
        }else if(G1[1]==G3[1]){
            Y=G2[1];
        }else{
            Y=G1[1];
        }
        System.out.print(X+" "+Y);
    }
}
