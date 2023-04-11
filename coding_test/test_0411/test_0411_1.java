/*  백준 2869번 문제풀이)
 *  땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.
    달팽이는 낮에 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다. 또, 정상에 올라간 후에는 미끄러지지 않는다.
    달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오.

    ex) 입력: 첫째 줄에 세 정수 A, B, V가 공백으로 구분되어서 주어진다. (1 ≤ B < A ≤ V ≤ 1,000,000,000)
        출력: 첫째 줄에 달팽이가 나무 막대를 모두 올라가는데 며칠이 걸리는지 출력한다.

        입력: 2 1 5 
        출력: 4 
 */
package test_0411;

import java.util.Scanner;

public class test_0411_1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int cnt = 0;
        int res = 0;
        System.out.print("A,B,V 값을 차례대로 입력해주세요.");
        int A = scan.nextInt(); // 낮에 달팽이가 올라가는 높이.
        int B = scan.nextInt(); // 밤에 달팽이가 미끄러지는 높이
        int V = scan.nextInt(); // 나무막대의 높이

        //while 문을 통해 res(달팽이가 현재올라간 높이)가 막대높이보다 낮다면 계속 반복되게 해주었다. 
        while(res<V){
            res += A-B; // 현재 올라간높이를  A-B씩 더해주었다.
            cnt++;      // 최종걸린 일수를 cnt에 저장해주었다.
            if(res+A>=V){ // 나무막대 정상에올라갔을때는 미끌어지지않기때문에 if문을통해 조건을 설정해주었다.
                break;
            }
        }
        System.out.print((cnt+1)+"일");
    }
}
