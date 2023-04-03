/*
    평균구하기.


    1. 첫째줄에는 테스트케이스 수 C가 주어진다.
    
    2. 둘째줄부터 N명의 점수가 주어지고, N명의 점수의 평균값을구해,
        평균을 넘는학생들의 비율을 반올림하여 소숫점셋째자리까지 출력해준다.
        
    ex) 입력
        5
        5 50 50 70 80 100
        7 100 95 90 80 70 60 50
        3 70 90 80
        3 70 90 81
        9 100 99 98 97 96 95 94 93 91
        
        
        출력
        40.000%
        57.143%
        33.333%
        66.667%
        55.556%     

 */
package test_0403;

import java.util.Scanner;

public class test_0403_1 {

    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);

       int [] scorelist; //점수 목록을 저장해줄 리스트.
      
       System.out.println("테스트 수를 입력하세요.");
       int C = scan.nextInt();

    
    // 1.테스트 반복문
       for(int i=0; i<C; i++){
        System.out.println(i+"번째");
        System.out.println();

        System.out.println("학생수를 입력하세요.");
        int N = scan.nextInt();
        scorelist = new int[N];
    // 학생수에 맞는 점수입력.
        double sum = 0;
        for(int j=0; j<N; j++){
            int score =scan.nextInt();
            scorelist[j] =score;
            sum += score; //학생들의 점수합.
        }

        double mean = (sum/N);
        double cnt = 0;

    //각각의 점수가 평균보다 높은지 구분
        for(int k=0; k<N; k++){
            if(scorelist[k]>mean){  // 점수가 평균보다 높다면 cnt값 1 증가.
                cnt++;
            }
        }
        System.out.printf("%.3f%%\n",(cnt/N)*100); // 평균보다 높은 점수를 보유한 학생의 비율을 소숫점3자리까지 표현.
       }
    }
}
