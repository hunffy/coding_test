/*  백준 11478번 문제풀이)

    문자열 S가 주어졌을 때, S의 서로 다른 부분 문자열의 개수를 구하는 프로그램을 작성하시오.
    부분 문자열은 S에서 연속된 일부분을 말하며, 길이가 1보다 크거나 같아야 한다.
    예를 들어, ababc의 부분 문자열은 a, b, a, b, c, ab, ba, ab, bc, aba, bab, abc, abab, babc, ababc가 있고, 서로 다른것의 개수는 12개이다.

    입력)
    첫째 줄에 문자열 S가 주어진다. S는 알파벳 소문자로만 이루어져 있고, 길이는 1,000 이하이다.

    출력)
    첫째 줄에 S의 서로 다른 부분 문자열의 개수를 출력한다.

 *  
 */
package test_0606;

import java.util.HashSet;
import java.util.Scanner;

public class test_0606_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String S = in.next();
        HashSet <String> list = new HashSet<>();

        //substring을 통해 s에 저장된 문자열을 나누어 list에 저장해주는 부분
        for(int i=0; i<S.length(); i++){
            for(int j=i+1; j<=S.length(); j++){
                list.add(S.substring(i, j));
            }
        }
        //나뉘어진 문자들의 갯수를 출력해주는 부분
        System.out.print(list.size());
    }
}
