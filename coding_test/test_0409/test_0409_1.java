
/*  백준 2720 문제풀이)
 *  미국으로 유학간 동혁이는 세탁소를 운영하고 있다. 
 *  동혁이는 최근에 아르바이트로 고등학생 리암을 채용했다.
    동혁이는 리암에게 실망했다.
    리암은 거스름돈을 주는 것을 자꾸 실수한다.
    심지어 $0.5달러를 줘야하는 경우에 거스름돈으로 $5달러를 주는것이다!
    어쩔수 없이 뛰어난 코딩 실력을 발휘해 리암을 도와주는 프로그램을 작성하려고 하지만, 
    디아블로를 하느라 코딩할 시간이 없어서 이 문제를 읽고 있는 여러분이 대신 해주어야 한다.
    거스름돈의 액수가 주어지면 리암이 줘야할 쿼터(Quarter, $0.25)의 개수, 다임(Dime, $0.10)의 개수, 
    니켈(Nickel, $0.05)의 개수, 페니(Penny, $0.01)의 개수를 구하는 프로그램을 작성하시오. 
    거스름돈은 항상 $5.00 이하이고, 손님이 받는 동전의 개수를 최소로 하려고 한다. 
    
    예를 들어, $1.24를 거슬러 주어야 한다면, 손님은 4쿼터, 2다임, 0니켈, 4페니를 받게 된다.
 */
package test_0409;

import java.util.Scanner;

public class test_0409_1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("테스트 수 T를 입력해주세요.");
        int T = scan.nextInt();
        for(int i=0; i<T; i++){
            System.out.println("거스름돈 C를 입력해주세요.");
            int C = scan.nextInt();
            System.out.print(C/25+" ");
            System.out.print(C%25/10+" ");
            System.out.print(C%25%10/5+" ");
            System.out.println(C%25%10%5/1+" ");
        }
    }
}
