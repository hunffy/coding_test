//백준 2566 문제풀이) 2차원 배열 최댓값의 요소와 인덱스값 출력하기
package test_0403;

import java.util.Scanner;
import java.util.Arrays;

public class test_0403_3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int [][] arr = new int[9][9];
        int max = 0;
        int x =0;
        int y =0;

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                System.out.print("요소의 값을 입력하세요.");
                arr[i][j] = in.nextInt();
                if(arr[i][j]>max){
                    max = arr[i][j];
                    x=i; y=j;
                }
            }
        }
        System.out.println(max);
        System.out.println(x+"행"+y+"열");
    }
}
