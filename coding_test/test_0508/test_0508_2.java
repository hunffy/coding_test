/*  백준 24263번 문제풀이)
    
    오늘도 서준이는 알고리즘의 수행시간 수업 조교를 하고 있다. 
    아빠가 수업한 내용을 학생들이 잘 이해했는지 문제를 통해서 확인해보자.
    입력의 크기 n이 주어지면 MenOfPassion 알고리즘 수행 시간을 
    예제 출력과 같은 방식으로 출력해보자.

    MenOfPassion 알고리즘은 다음과 같다.

    MenOfPassion(A[], n) {
        sum <- 0;
        for i <- 1 to n
            sum <- sum + A[i]; # 코드1
        return sum;
    }
 * 
 */
package test_0508;

import java.util.Scanner;

public class test_0508_2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        // 입력값 n에따라 MenOfPassion은 n번실행되기때문에 n번수행된다.
        System.out.println(n); 

        // 입력값이 몇이든, 결과값은 1이된다.
        System.out.println("1");
    }
}
