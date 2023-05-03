/*  백준 10101번 문제풀이)

    창영이는 삼각형의 종류를 잘 구분하지 못한다. 
    따라서 프로그램을 이용해 이를 외우려고 한다.
    삼각형의 세 각을 입력받은 다음, 

    세 각의 크기가 모두 60이면, Equilateral
    세 각의 합이 180이고, 두 각이 같은 경우에는 Isosceles
    세 각의 합이 180이고, 같은 각이 없는 경우에는 Scalene
    세 각의 합이 180이 아닌 경우에는 Error
    를 출력하는 프로그램을 작성하시오.

    입력)
    총 3개의 줄에 걸쳐 삼각형의 각의 크기가 주어진다. 
    모든 정수는 0보다 크고, 180보다 작다.

    출력)
    문제의 설명에 따라 Equilateral, Isosceles, Scalene, Error 중 하나를 출력한다.
 * 
 */
package test_0503;

import java.util.Scanner;

public class test_0503_4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("A,B,C값을 입력하세요.");
        
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();

        //A,B,C 값이 모두 60인경우
        if(A==60 && B==60 && C==60){
            System.out.print("Equilateral");
        }
        // 세각의 합이 180이고, 2각의 값이 같을경우
        else if(A+B+C==180 && (A==B || B==C || A==C)){
            System.out.print("Isosceles");
        // 세각의 합이 180이고, 모든 각의 값이 다를경우
        }else if(A+B+C==180 && A!=B && B!=C && A!=C){
            System.out.print("Scalene");
        // 세각의 합이 180이 아닌경우
        }else if(A+B+C!=180){
            System.out.print("Error");
        }
    }
}
