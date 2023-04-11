/* 백준 5086번 문제풀이)
    
    4 × 3 = 12이다.
    이 식을 통해 다음과 같은 사실을 알 수 있다.

    3은 12의 약수이고, 12는 3의 배수이다.

    4도 12의 약수이고, 12는 4의 배수이다.

    두 수가 주어졌을 때, 다음 3가지 중 어떤 관계인지 구하는 프로그램을 작성하시오.

    첫 번째 숫자가 두 번째 숫자의 약수이다.
    첫 번째 숫자가 두 번째 숫자의 배수이다.
    첫 번째 숫자가 두 번째 숫자의 약수와 배수 모두 아니다.
 * 
 */
package test_0411;

import java.util.Scanner;

public class test_0411_2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("두 수를 입력하세요.");
        int N = scan.nextInt();
        int N2 = scan.nextInt();

        if(N2%N==0){
            System.out.print("N은 N2의 약수");
        }else if(N%N2==0){
            System.out.print("N은 N2의 배수");
        }else if(N==0 && N2==0){
            System.out.print("약수와 배수 모두아니다.");
        }else {
            System.out.print("약수와 배수 모두아니다.");
        }

    }
}
