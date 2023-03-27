package test_0326;
import java.util.Scanner;

/* 
3. 알람시계

"""
45분 일찍 알람 설정하기.
원래 설정되어 있는 알람을 45분 앞서는 시간으로 바꾸기.

첫째 줄에 두 정수 H와 M이 주어진다(0<= H <=23 , 0 <= M <= 59)
이것은 상근이가 설정해 놓은 알람 시간과 분이다.

입력시간은 24시간 표현을 사용한다. 24시간 표현에서 하루의 시작은 0:0(자정)
끝은 23:59(다음날 자정 1분 전) 이다. 시간을 나타낼 때, 불필요한 0은 사용하지 않는다.

시간과 분을 45분 전으로 설정하여 출력하기
"""
*/
public class test_0326_2 {
    public static void main(String[] args){
        System.out.println("시간 H과 분 M을 입력해주세요.");
        Scanner scan = new Scanner(System.in);
        int H = scan.nextInt();
        int M = scan.nextInt();

        if(M<45) {
            System.out.println((H-1)+"시"+(60-45+M)+"분");
        }else {
            System.out.println(H+"시"+(M-45)+"분");
        }
        scan.close();
    }
}
