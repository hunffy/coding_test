package test_0327;
import java.util.Scanner;

/* 
구매한 물건의 총금액과 영수증에 적힌 총 금액 일치하는지 검색해보기.


첫째 줄: 영수증에 적힌 총 금액 X
둘째 줄: 영수증에 적힌 구매물건의 종류 수 N
이후 각 물건의 가격 a와  개수 b가 공백을 사이에 두고 주어짐.

1<= X <= 1,000,000,000 (총 금액)
1<= N <= 100   (구매 물건의 종류수)
1<= a <= 1,000,000 (각 물건의 가격)
1 <= b <= 10 (각 물건의 갯수)
*/

public class test_0327_3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("영수증 총금액 X값을 입력해주세요.");
        int X = scan.nextInt();
        System.out.println("물건의 총 종류수 N값을 입력해주세요.");
        int N = scan.nextInt();
        int res = 0;
        for(int i=0; i<N; i++){
            System.out.println("각 물건의 가격 a와 갯수 b를 입력해주세요.");
            int a = scan.nextInt();
            int b = scan.nextInt();
            res += a*b;
        }
        if(X==res){
            System.out.println("영수증값과 실제금액이 일치합니다.");
        }else{
            System.out.println("값이 일치하지않습니다. 종업원에게 따지세요.");
        }

    }
}
