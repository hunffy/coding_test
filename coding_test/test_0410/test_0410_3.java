/*  백준 2525번 문제풀이)

    KOI 전자에서는 건강에 좋고 맛있는 훈제오리구이 요리를 간편하게 만드는 인공지능 오븐을 개발하려고 한다.
    인공지능 오븐을 사용하는 방법은 적당한 양의 오리 훈제 재료를 인공지능 오븐에 넣으면 된다. 
    그러면 인공지능 오븐은 오븐구이가 끝나는 시간을 분 단위로 자동적으로 계산한다. 

    또한, KOI 전자의 인공지능 오븐 앞면에는 사용자에게 
    훈제오리구이 요리가 끝나는 시각을 알려 주는 디지털 시계가 있다. 

    훈제오리구이를 시작하는 시각과 오븐구이를 하는 데 필요한 시간이 분단위로 주어졌을 때, 
    오븐구이가 끝나는 시각을 계산하는 프로그램을 작성하시오.
 * 
 */
package test_0410;

import java.util.Scanner;

public class test_0410_3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("현재시각 시간 값 A를 입력하세요.");
        int A = scan.nextInt();
        System.out.println("현재시각 분 값 B를 입력하세요.");
        int B = scan.nextInt();
        System.out.print("조리에 필요한 시간 C를 입력하세요.");
        int C = scan.nextInt();

        //현재시간을 전부 분으로 치환
        int min = 60*A+B;

        //min = 현재시간+조리시간
        min += C;

        // 총 조리시간 현재 분으로 치환된부분을 시간으로 변환하고, 24시이상일경우 0으로 해주기위해
        // %24로 나누어준다.
        int res_S = (min/60)%24;

        // 60으로 나눈 나머지 시간으로 치환되고 남은 분을 나타내준다.
        int res_M = min%60;

        System.out.print(res_S+"시"+res_M+"분");
    }
}
