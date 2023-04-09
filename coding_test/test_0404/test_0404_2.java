/*  백준 2563 문제풀이)
    가로, 세로의 크기가 각각 100인 정사각형 모양의 흰색 도화지가 있다. 
    이 도화지 위에 가로, 세로의 크기가 각각 10인 정사각형 모양의 검은색 색종이를 색종이의 변과 도화지의 변이 평행하도록 붙인다. 
    이러한 방식으로 색종이를 한 장 또는 여러 장 붙인 후 색종이가 붙은 검은 영역의 넓이를 구하는 프로그램을 작성하시오.
 * 
 */

package test_0404;

import java.util.Scanner;

public class test_0404_2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int arr[][] = new int[100][100];
        int cnt = 0;
        System.out.print("색종이수를 입력하세요");
        int N = scan.nextInt();

        for(int i=0; i<N; i++){
            System.out.println((i+1)+"번째 색종이");
            System.out.println("X값을 입력하세요.");
            System.out.println("Y값을 입력하세요.");
            int X =scan.nextInt();
            int Y =scan.nextInt();
            
            //입력한 색종이의 범위에 해당하면 1로 설정해준다.
            for(int j=X; j<X+10; j++){
                for(int k=Y; k<Y+10; k++){
                    arr[j][k]=1;
                }
            }
        }

        // 전체 도화지크기에서 1로표시한 색종이범위가 존재하면 cnt를 1증가시킨다.
        // 이때 겹쳐지는 색종이범위는 빼진다.
        for(int i=0; i<100; i++){
            for(int j=0; j<100; j++){
                if(arr[i][j]==1){
                    cnt++;
                }
            }
        }
        System.out.print(cnt);
    }
}
