/*  백준 2798번 문제풀이)

    카지노에서 제일 인기 있는 게임 블랙잭의 규칙은 상당히 쉽다. 카드의 합이 21을 넘지 않는 한도 내에서, 
    카드의 합을 최대한 크게 만드는 게임이다.블랙잭은 카지노마다 다양한 규정이 있다.
    한국 최고의 블랙잭 고수 김정인은 새로운 블랙잭 규칙을 만들어 상근, 창영이와 게임하려고 한다.
    김정인 버전의 블랙잭에서 각 카드에는 양의 정수가 쓰여 있다. 그 다음, 
    딜러는 N장의 카드를 모두 숫자가 보이도록 바닥에 놓는다. 그런 후에 딜러는 숫자 M을 크게 외친다.
    이제 플레이어는 제한된 시간 안에 N장의 카드 중에서 3장의 카드를 골라야 한다. 
    블랙잭 변형 게임이기 때문에, 플레이어가 고른 카드의 합은 M을 넘지 않으면서 M과 최대한 가깝게 만들어야 한다.
    N장의 카드에 써져 있는 숫자가 주어졌을 때, M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 구해 출력하시오.

    입력)
    첫째 줄에 카드의 개수 N(3 ≤ N ≤ 100)과 M(10 ≤ M ≤ 300,000)이 주어진다. 
    둘째 줄에는 카드에 쓰여 있는 수가 주어지며, 이 값은 100,000을 넘지 않는 양의 정수이다.
    합이 M을 넘지 않는 카드 3장을 찾을 수 있는 경우만 입력으로 주어진다.

    출력)
    첫째 줄에 M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 출력한다.
 * 
 */
package test_0508;

import java.util.ArrayList;
import java.util.Scanner;

public class test_0508_3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //카드의 수N과 카드3개의 합 M을 정해준다.
        System.out.println("N,M값을 입력하세요.");
        int N = scan.nextInt();
        int M = scan.nextInt();

        //리스트를 만들어, 카드 각각의 숫자를 입력해준다.
        ArrayList <Integer> N_list = new ArrayList<>();
        for(int i=0; i<N; i++){
            System.out.println("카드 값을 입력하세요.");
            N_list.add(scan.nextInt());
        }
        
        // 반복문을통해 카드3개의 합이 M과 같거나 가장근접한 값을 찾아준다.
        // ex) N = 5 M = 21
        // 각 카드의 숫자 : 5 6 7 8 9 일때
        // 1번째반복문 : N_list(i) = 5 , N_list(j) = 6 , N_list(k) = 7    hap = 18   if조건문에  18<=21 && 18>0  이기때문에 조건을 만족해서 maxHap=18이된다.
        // 2번째반복문 : N_list(i) = 5 , N_list(j) = 6 , N_list(k) = 8    hap = 19   if조건문에  19<=21 && 19>18 이기때문에 조건을 만족해서 maxHap=19가 된다.
        // 반복문이 끝났을때는 maxHap은 M과 같거나 가장근접한값으로 수정되어있다.
        int hap = 0;
        int maxHap = 0;
        for(int i=0; i<N-2; i++){
            for(int j=i+1; j<N-1; j++){
                for(int k=j+1; k<N; k++){
                    hap = N_list.get(i)+N_list.get(j)+N_list.get(k);
                    if(hap<=M && hap>maxHap){
                        maxHap = hap;
                    }
                }
            }
        }
        System.out.println("M에 가장 근접한 값 : "+maxHap);
    }
}
