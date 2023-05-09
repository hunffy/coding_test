/*  백준 2231번 문제풀이)

    어떤 자연수 N이 있을 때, 그 자연수 N의 분해합은 N과 N을 이루는 각 자리수의 합을 의미한다. 
    어떤 자연수 M의 분해합이 N인 경우, M을 N의 생성자라 한다. 
    예를 들어, 245의 분해합은 256(=245+2+4+5)이 된다. 따라서 245는 256의 생성자가 된다. 
    물론, 어떤 자연수의 경우에는 생성자가 없을 수도 있다. 반대로, 생성자가 여러 개인 자연수도 있을 수 있다.
    자연수 N이 주어졌을 때, N의 가장 작은 생성자를 구해내는 프로그램을 작성하시오.

    입력)
    첫째 줄에 자연수 N(1 ≤ N ≤ 1,000,000)이 주어진다.

    출력)
    첫째 줄에 답을 출력한다. 생성자가 없는 경우에는 0을 출력한다.
 * 
 */
package test_0509;

import java.util.ArrayList;
import java.util.Scanner;

//숫자를 분해하여, N에 해당하는 생성자를 더하는구간.
public class test_0509_1 {
    public static int decompose(int num){
        //먼저 해당숫자를 더해준다. ex) i가 198이면 198을 더해준다.
        int sum = num;

        // 198의 각자릿수를 sum에 더해준다 
        // 1번째. 198+=  198%10인 8 =>   sum = 198+8
        //               198/=10인 19 => num =  19
        // 2번째. 198+8+= 19%10 인  9 => sum = 198+8+9
        //                19/10 인  10 => num =   10
        // 3번째 198+8+9+= 10%10인  0  => sum = 198+8+9+0
        //                 10/10인  1  => num = 1
        // 4번째 198+8+9+0+= 1%10인 1  => sum = 198+8+9+0+1
        //                   1/10은 0보다작다. while문이종료
        // 198+8+9+0+1 더해진값 216이 sum에 저장되고 return된다.

        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("자연수 N을 입력하세요.");
        
        int N = scan.nextInt();
        int result = 0;

        for(int i=1; i<N; i++){
            int sum = decompose(i);

            //decompose 메서드에서 리턴된 sum값이 입력값 N과 같다면 
            //result에 i값이 저장되고 종료된다.
            if(N==sum){
                result=i;
                break;
            }
        }
        //결과값으로, result를 출력해주면 종료된다.
        System.out.print("결과 : "+result);
    }
}
