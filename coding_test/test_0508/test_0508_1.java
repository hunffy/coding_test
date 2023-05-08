/*  백준 24262번 문제풀이)
    오늘도 서준이는 알고리즘의 수행시간 수업 조교를 하고 있다. 
    아빠가 수업한 내용을 학생들이 잘 이해했는지 문제를 통해서 확인해보자.
    입력의 크기 n이 주어지면 MenOfPassion 알고리즘 수행 시간을 
    예제 출력과 같은 방식으로 출력해보자.

    MenOfPassion 알고리즘은 다음과 같다.

    MenOfPassion(A[], n) {
        i = [n/2];
        return A[i]; # 코드1
    }

    입력)
    첫째 줄에 입력의 크기 n(1 ≤ n ≤ 500,000)이 주어진다.

    출력)
    첫째 줄에 코드1 의 수행 횟수를 출력한다.
    둘째 줄에 코드1의 수행 횟수를 다항식으로 나타내었을 때, 
    최고차항의 차수를 출력한다. 
    단, 다항식으로 나타낼 수 없거나 최고차항의 차수가 3보다 크면 4를 출력한다.
 * 
 */
package test_0508;

import java.util.Scanner;

public class test_0508_1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("n값을 입력하세요");
        int n = scan.nextInt();

        //코드1은 어떤입력값을 가지던, 코드는1번만 실행된다.
        System.out.print("1");// 코드1의 수행횟수
        System.out.print("0");// 수행횟수는 1번만 되기때문에 최고차항의 차수는 0
    }
}
