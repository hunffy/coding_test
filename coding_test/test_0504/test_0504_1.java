/*  백준 14215번 문제풀이)
 *  
 *  영선이는 길이가 a, b, c인 세 막대를 가지고 있고, 각 막대의 길이를 마음대로 줄일 수 있다.

    영선이는 세 막대를 이용해서 아래 조건을 만족하는 삼각형을 만들려고 한다.

    각 막대의 길이는 양의 정수이다
    세 막대를 이용해서 넓이가 양수인 삼각형을 만들 수 있어야 한다.
    삼각형의 둘레를 최대로 해야 한다.
    a, b, c가 주어졌을 때, 만들 수 있는 가장 큰 둘레를 구하는 프로그램을 작성하시오. 

    입력)
    첫째 줄에 a, b, c (1 ≤ a, b, c ≤ 100)가 주어진다.

    출력)
    첫째 줄에 만들 수 있는 가장 큰 삼각형의 둘레를 출력한다.
 */
package test_0504;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class test_0504_1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("3개의 각 변의 값을 입력해주세요.");

        int a = scan.nextInt(); 
        int b= scan.nextInt();
        int c = scan.nextInt();
        
        ArrayList <Integer> nlist = new ArrayList<>(Arrays.asList(a,b,c));
        

        // 임의로 입력된 값을 오름차순 정렬해준다.
        Collections.sort(nlist);

        //2번째 3번째로 큰 변의값의 합이 가장큰변의합보다 클 경우 세변의 합을 그대로 더해 출력해준다.
        if(nlist.get(0)+nlist.get(1)>nlist.get(2)){
            System.out.println(nlist.get(0)+nlist.get(1)+nlist.get(2));

        //2,3번째 변의 합이 가장큰변의 합보다 작은경우
        // 가장 큰 변을 2,3번째변의 합에서 1빼준값으로 해준다.
        }else{
            System.out.println((nlist.get(0)+nlist.get(1))*2-1);
        }
    }
}
