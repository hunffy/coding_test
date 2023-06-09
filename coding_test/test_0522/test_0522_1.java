/*  백준 10814번 문제풀이)

    온라인 저지에 가입한 사람들의 나이와 이름이 가입한 순서대로 주어진다. 
    이때, 회원들을 나이가 증가하는 순으로, 나이가 같으면 먼저 가입한 사람이 앞에 오는 순서로 정렬하는 프로그램을 작성하시오.

    입력)
    첫째 줄에 온라인 저지 회원의 수 N이 주어진다. (1 ≤ N ≤ 100,000)
    둘째 줄부터 N개의 줄에는 각 회원의 나이와 이름이 공백으로 구분되어 주어진다. 
     1보다 크거나 같으며, 200보다 작거나 같은 정수이고, 이름은 알파벳 대소문자로 이루어져 있고, 
     길이가 100보다 작거나 같은 문자열이다. 입력은 가입한 순서로 주어진다.

     출력)
     첫째 줄부터 총 N개의 줄에 걸쳐 온라인 저지 회원을 나이 순, 
     나이가 같으면 가입한 순으로 한 줄에 한 명씩 나이와 이름을 공백으로 구분해 출력한다.
 * 
 */
package test_0522;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class test_0522_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("테스트 수 N을 입력하세요.");
        int N = in.nextInt();

        String [][] member = new String[N][2];

        for(int i=0; i<N; i++){
            System.out.println("나이를 입력하세요.");
            member[i][0]=in.next();
            System.out.println("이름을 입력하세요.");
            member[i][1]=in.next();
        }

        //Comparator 두개의 객체를 비교해준다. <객체의 타입을 지정해준다.>
        Arrays.sort(member, new Comparator<String[]>() {
            @Override
            public int compare(String[] s1, String[]s2){
                //parsInt 문자를 숫자로 변환해준다.
                return Integer.parseInt(s1[0])-Integer.parseInt(s2[0]);
            }
        });
        System.out.println("");
        for(int i=0; i<N; i++){
            System.out.println(member[i][0]+" "+member[i][1]);
        }
    }
}
