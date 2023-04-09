/* 백준 2738 문제풀이)
 * 2차원 배열의 합 구하기.
 * 행렬의 크기 N과 M을 입력받는다.
 * 
 */

package test_0403;

import java.util.Scanner;

public class test_0403_2 {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("N과 M값을 입력해주세요.");
    int N = scan.nextInt();
    int M = scan.nextInt();
    int [][] arr1 = new int[N][M];
    int [][] arr2 = new int[N][M];
    
    //arr1 배열 값 입력
    for(int i=0; i<N; i++){
        for(int j=0; j<M; j++){
            System.out.print("arr1 값을 입력해주세요.");
            arr1[i][j]=scan.nextInt();
        }
    }
    //arr2 배열 값 입력
    for(int i=0; i<N; i++){
        for(int j=0; j<M; j++){
            System.out.print("arr2 값을 입력해주세요.");
            arr2[i][j] = scan.nextInt();
        }
    }

    //arr1+arr2 배열의 합 결과 도출
    for(int i=0; i<N; i++){
        for(int j=0; j<M; j++){
            System.out.print(arr1[i][j]+arr2[i][j]+" ");
            if( j == M-1){
                System.out.println();
            }
        }  
    }
    }
}
