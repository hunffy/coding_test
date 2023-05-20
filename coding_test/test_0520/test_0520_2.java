/*  백준 1181번 문제풀이)
    알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.
    길이가 짧은 것부터 길이가 같으면 사전 순으로단, 중복된 단어는 하나만 남기고 제거해야 한다.

    입력)
    첫째 줄에 단어의 개수 N이 주어진다. (1 ≤ N ≤ 20,000) 둘째 줄부터 N개의 줄에 걸쳐 알파벳 소문자로 이루어진 단어가 한 줄에 하나씩 주어진다. 
    주어지는 문자열의 길이는 50을 넘지 않는다.

    출력)
    조건에 따라 정렬하여 단어들을 출력한다.
 * 
 */
package test_0520;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class test_0520_2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("단어의 갯수 N을 입력하세요");
        int N = in.nextInt();
        in.nextLine();

        String word [] = new String[N];

        for(int i=0; i<N; i++){
            System.out.println("단어를 입력하세요");
            word[i]=in.nextLine();
        }
        Arrays.sort(word, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2){
                if(s1.length()==s2.length()){
                    return s1.compareTo(s2);
                }else{
                    return s1.length()-s2.length();
                }
            }
        });

        for(int i=0; i<N; i++){
            if(i>0 && word[i].equals(word[i-1])){ continue;}
            System.out.println(word[i]);
        }
    }
}
