import java.util.Scanner;

/*
별 찍기

첫째 줄 : 별1개
둘째줄 : 별3개
N번째 줄: 별 N개를 찍는 문제.

ex) 입력 :5
    *
    **
    ***
    ****
    *****
 */

public class test_0327_4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("N값을 입력해주세요");
        int N = scan.nextInt();

        for(int i=1; i<=N; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }System.out.println();
        }
    }
}
