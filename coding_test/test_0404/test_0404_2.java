package test_0404;

import java.util.Scanner;

public class test_0404_2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int arr[][] = new int[100][100];
        int count = 0;
        System.out.print("색종이수를 입력하세요");
        int N = scan.nextInt();

        for(int i=0; i<N; i++){
            System.out.println(i+"번째 색종이");
            System.out.println("X값을 입력하세요.");
            System.out.println("Y값을 입력하세요.");
            int X =scan.nextInt();
            int Y =scan.nextInt();
            for(int j=X; j<X+10; j++){
                for(int k=Y; k<Y+10; k++){
                    arr[j][k]=1;
                }
            }
        }
        for(int i=0; i<100; i++){
            for(int j=0; j<100; j++){
                if(arr[i][j]==1){
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}
