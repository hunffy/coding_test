/*  백준 3052번 문제풀이)
 *  두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 
    수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
 */

package test_0417;


import java.util.HashSet;
import java.util.Scanner;

public class test_0417_1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        HashSet<Integer> N_set = new HashSet<Integer>();   // hashset은 중복을 허용하지않는다. 그리고 순서는정열되지않는다.
                                                            // 이 문제에서는 순서는 상관없기때문에 hashset을 사용하였다.

        for(int i=0; i<10; i++){                            
            System.out.println("숫자를 입력하세요");
            N_set.add(scan.nextInt()%42);  // N_set에 10개의 수를입력하고 입력과동시에 42로 나눈 나머지값을 바로 요소로 저장해준다. 
        }
    System.out.println("");
    System.out.print("결과 :"+N_set.size());       // 저장된 나머지값인 요소에서 중복된값들은 1개로 통일되고, 서로 각기다른 수들의 size() 즉 갯수를 출력하게된다.
    }
}
