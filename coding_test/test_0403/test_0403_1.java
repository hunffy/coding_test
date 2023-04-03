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
       System.out.print("테스트 케이스 C를 입력해주세요.");
       int C = scan.nextInt();
       int score_list [];
       for(int i=0; i<C; i++){
        System.out.println("학생수를 입력하세요.");
        int N = scan.nextInt();
        score_list = new int[N];

        double sum =0;

        for(int j=0; j<N; j++){
            System.out.println("점수를 입력하세요.");
            int score = scan.nextInt();
            score_list[j] = score;
            sum += score;
        }

        double mean = (sum/N);
        double cnt = 0;

        for(int k=0; k<N; k++){
            if(score_list[k]>mean){
                cnt++;
            }
        }
        System.out.printf("평균보다 높은득점을 한 학생비율 :"+"%.3f%%\n",(cnt/N)*100);
       }
    }
}
