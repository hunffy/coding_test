/*  
    영어단어가 주어졌을 때 가장 많이 사용된 알파벳을 대문자로 출력해주기.
    단, 여러개 존재하는경우에는 ?로 출력
 
 */
package test_0331;

import java.util.Scanner;

public class test_0331_1{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("단어를 입력하세요.");
        String S = scan.next();
        int [] A = new int[26];

        for(int i=0; i<S.length(); i++){
            if('A'<= S.charAt(i) && S.charAt(i) <= 'Z'){ //대문자일때
                A[S.charAt(i)-'A']++;   //해당 인덱스값 증가
            }
            else { //소문자일때
                A[S.charAt(i)-'a']++;  //해당 인덱스값 증가
            }
        }

        int max = -1;    //가장 많이 사용된알파벳
        char ch = '?';  // 여러개인경우
        
        for(int i=0; i<26; i++){
            if(A[i] >max){
                max = A[i];
                ch = (char)(i +65); //대문자 출력위해 65더해준다.
            }
            else if (A[i] == max){
                ch = '?';
            }
        }
        System.out.print(ch);
    }
}