/*  백준 9506번 문제풀이)

    어떤 숫자 n이 자신을 제외한 모든 약수들의 합과 같으면, 그 수를 완전수라고 한다.
    예를 들어 6은 6 = 1 + 2 + 3 으로 완전수이다.
    n이 완전수인지 아닌지 판단해주는 프로그램을 작성하라.

    입력)

    입력은 테스트 케이스마다 한 줄 간격으로 n이 주어진다. (2 < n < 100,000)
    입력의 마지막엔 -1이 주어진다.

    출력)

    테스트케이스 마다 한줄에 하나씩 출력해야 한다.
    n이 완전수라면, n을 n이 아닌 약수들의 합으로 나타내어 출력한다(예제 출력 참고).
    이때, 약수들은 오름차순으로 나열해야 한다.
    n이 완전수가 아니라면 n is NOT perfect. 를 출력한다.
 * 
 */
package test_0426;

import java.util.Scanner;

public class test_0426_1 {public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N;

    while (true) {
        System.out.print("숫자 N값을 입력하세요. (-1 입력 시 종료): ");
        N = scan.nextInt();

        //-1입력시 종료
        if (N == -1) {
            break;
        }

        int[] N_list = new int[N + 1]; // 배열 크기 수정
        int cnt = 0;
        int hap = 0;

        //숫자N에 해당하는 약수들을 N_list에 넣는구간
        for (int i = 1; i <= N / 2; i++) { // i의 범위는 N / 2 까지 본인을 제외해야하고, 약수는 약수/2 의 결과값보다 작거나 같기때문이다.
            if (N % i == 0) {
                N_list[cnt] = i;
                cnt++;
                hap += i;
            }
        }

        //약수들의 합이 약수와 같은 완전수일때.
        if (N == hap) {
            System.out.print(N + " = ");
            for (int j = 0; j < cnt; j++) { // 
                System.out.print(N_list[j] + " ");
                if (j < cnt - 1) {
                    System.out.print("+ ");
                }
            }
            System.out.println();
        // 완전수가 아닐 때
        } else {
            System.out.println(N + " is NOT perfect");
        }
    }
}
}