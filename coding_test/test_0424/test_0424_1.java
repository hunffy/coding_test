/*  백준 10757번 문제풀이)
    두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

    입력)
    첫째 줄에 A와 B가 주어진다. (0 < A,B < 1010000)


    출력)
    첫째 줄에 A+B를 출력한다.
 * 
 */
package test_0424;

import java.math.BigInteger;
import java.util.Scanner;

public class test_0424_1 {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("덧셈을 할 A값과 B값을 입력해주세요.");
    //long형이 넘어가는 매우 큰 수에 사용하게되는 BigInteger.
    //선언 및 생성을 해주고, 생성할 때 파라미터로 "문자열"을 넘겨준다.
    BigInteger A = new BigInteger(scan.next());
    BigInteger B = new BigInteger(scan.next());
    
    // add() 메서드는 해당 BigInteger 객체A와 파라미터(인자)로 들어온 B객체의
    // 더한값을 BigInteger 타입으로 반환한다.
    A = A.add(B);

    System.out.print("결과 :" + A.toString());

    }
}
