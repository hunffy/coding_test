/*  백준 2581번 문제풀이)
    
    자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 
    소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.
    예를 들어 M=60, N=100인 경우 60이상 100이하의 자연수 중 
    소수는 61, 67, 71, 73, 79, 83, 89, 97 총 8개가 있으므로, 
    이들 소수의 합은 620이고, 최솟값은 61이 된다.

    입력)

    입력의 첫째 줄에 M이, 둘째 줄에 N이 주어진다.
    M과 N은 10,000이하의 자연수이며, M은 N보다 작거나 같다.

    출력)

    M이상 N이하의 자연수 중 소수인 것을 모두 찾아 
    첫째 줄에 그 합을, 둘째 줄에 그 중 최솟값을 출력한다. 
    단, M이상 N이하의 자연수 중 소수가 없을 경우는 첫째 줄에 -1을 출력한다.
 * 
 */
package test_0427;

import java.util.Scanner;

public class test_0427_2 {
    public static boolean isPrime(int num){
        if(num==1){
            return false;
        }
        for(int i=2; i<num; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("10,000이하의 범위 M이상 N이하 를 정해주세요.");
        int M = scan.nextInt();
        int N = scan.nextInt();
        int hap = 0;
        int min = -1;
        for(int i=M; i<=N; i++){
            if(isPrime(i)){
                hap+=i;
                if(min == -1 || min > i){
                    min = i;
                }
            }
        }
        if(min==-1){
            System.out.println(min);
        }else{
        System.out.println(hap);
        System.out.println(min);
        }
    }
}
