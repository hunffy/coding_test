/*  백준 1978번 문제풀이)
 *  
 *  주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
 * 
 *  입력)
 *  첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 
 *  다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.
 * 
 *  출력)
 *  주어진 수들 중 소수의 개수를 출력한다.
 * 
 *  예제입력)
 *  4
 *  1 3 5 7
 * 
 *  예제출력)
 *  3
 *  
 */
package test_0427;

import java.util.Scanner;

public class test_0427_1 {
    public static boolean isPrime(int num){

        // 숫자1은 소수가아니다.
        if(num == 1){
            return false;
        }
        // 2부터시작하여 입력값-1까지만 확인한다.
        // ex) num=10일때 10의 약수는 1, 2, 5, 10 
        // 1과 자기자신의 수를 제외한 나머지수를 검사한다.
        // 그중 나눠서 나머지가 0인값이나오는 2와5가있기때문에 false를 리턴해준다.
        // 1과 자기자신이외의 약수가없다면 true를 리턴 
        for(int i=2; i<num; i++){
            if(num%i ==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자의 갯수 N을 입력하세요.");
        int N = scan.nextInt();
        int cnt = 0;

        
        for(int i=0; i<N; i++){
            System.out.println("숫자를 입력하세요.");
            int k=scan.nextInt();
            //isPrime이 true일때 cnt가 증가한다.
            if(isPrime(k)){
                cnt++;
            }
        }
        System.out.print("갯수: " + cnt);
    }
}
