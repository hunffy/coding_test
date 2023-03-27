package test_0326;
import java.util.Scanner;
/* 
1. 윤년 판별하기
 연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력해준다.
 
 윤년조건.
 1. 4의 배수이다.
 2. 100의 배수가 아니다.
 3. 400의 배수이다.
 
 3가지 조건이 모두 충족되어야한다.
 
 예를 들어 2012년은 4의배수이면서,100의배수가 아니라서 윤년이다.
 
 1900년은 100의 배수이고 400의 배수는 아니기 떄문에 윤년이 아니다.
 
 하지만 2000년은 400의 배수이기 때문에 윤년이다.
 
 연도는 1보다 크거나 같고, 4000보다 작거나 같은 자연수이다.
 */

public class test_0326 {
    public static void main(String[] args){
        System.out.println("년도 'year'를 입력해주세요.");
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();

        if (year%4==0 && year%100!=0){
            System.out.println("윤년");
        }else if (year%400==0){
            System.out.println("윤년");
        }else {
            System.out.println("평년");
        }
        scan.close();
    }
}
