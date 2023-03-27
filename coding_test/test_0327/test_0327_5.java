package test_0327;
import java.util.Scanner;

/*
별 찍기2

첫째 줄 : 별1개
둘째 줄 : 별2개
N번째 줄 : 별 N개

하지만, 오른쪽을 기준으로 정렬한 별 출력

ex) 입력 : 5

    *                
   **
  ***
 ****
*****

 */

public class test_0327_5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("N값을 입력해주세요.");
        int N = scan.nextInt();

        for(int i=1; i<=N; i++){
            for(int j=1; j<=N-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }System.out.println();
        }
    }
}