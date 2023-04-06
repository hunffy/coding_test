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
