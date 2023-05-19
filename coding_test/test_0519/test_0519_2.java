/*  백준 1427번 문제풀이)

    배열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.

    입력)
    첫째 줄에 정렬하려고 하는 수 N이 주어진다. N은 1,000,000,000보다 작거나 같은 자연수이다.

    출력)
    첫째 줄에 자리수를 내림차순으로 정렬한 수를 출력한다.
 * 
 */
package test_0519;

import java.util.Scanner;

public class test_0519_2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        //숫자 N을 입력받는다
        System.out.print("숫자를 입력하세요.");
        int N = scan.nextInt();

        //카운팅 할 배열을 생성한다. 최대10자리수를 입력받을수있어, 배열의크기를 10으로 생성.
        int [] count = new int[10];

        //반복문을 통해 ex) N=2341 이라면  [0,1,1,1,1,0,0,0,0,0] 각 숫자에 해당하는 자리가 카운팅된다
        while(N!=0){
            count[N%10]++;
            N/=10;
        }
        //카운팅된 배열을 내림차순정렬해주기위해 뒤에서부터출력해줘야된다. 그래서 i=9부터 시작.
        //
        for(int i=9; i>=0; i--){
            //count[i]-->0 count[i]값이 0보다 크면 출력하고 값을 1씩 감소시켜준다.
            //값--; 와 값>0; 을 합쳐놓은 형태이다
            while(count[i]-->0){
                System.out.print(i);
            }
        }
    }
}
