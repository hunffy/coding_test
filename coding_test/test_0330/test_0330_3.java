/*  백준 3003번 문제풀이)
 * 검정색 체스말은 모두있고, 흰색 체스말은 부족하다.(반복문)
#. 체스는 총 16개의 말을 사용하여 킹1개, 퀸1개, 룩2개, 비숍2개 , 나이트2개, 폰8개로 구성되어있다.
#. 동혁이가 발견한 흰색 체스말 갯수가 주어졌을 때, 몇개를 더하거나 빼야 올바른 세트가 되는지 구하는 프로그램 만들기.

    1. 첫째 줄에 동혁이가 찾은 흰색 체스말 킹,퀸,룩,비숍,나이트,폰의 갯수가 주어진다.
    2. 이 값은 0보다 크거나 같고 10보다 작거나 같은 정수이다.
    
    ex) 입력: 0 1 2 2 2 7
        출력: 1 0 0 0 0 1
 */
package test_0330;

import java.util.Scanner;

public class test_0330_3 {
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);

       int king = 1;
       int queen = 1;
       int rook = 2;
       int bishop = 2;
       int knight = 2;
       int pawn = 8;

       System.out.print("체스말 갯수를 입력하세요.");
       king = king - scan.nextInt();
       queen = queen - scan.nextInt();
       rook = rook - scan.nextInt();
       bishop = bishop - scan.nextInt();
       knight = knight - scan.nextInt();
       pawn = pawn - scan.nextInt();

       System.out.print(king + " ");
       System.out.print(queen +" ");
       System.out.print(rook +" ");
       System.out.print(bishop +" ");
       System.out.print(knight +" ");
       System.out.print(pawn +" ");
    }
}
