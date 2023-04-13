/*  백준 10926번 문제풀이)
* 준하는 사이트에 회원가입을 하다가 joonas라는 아이디가 
* 이미 존재하는 것을 보고 놀랐다. 준하는 놀람을 ??!로 표현한다. 
* 준하가 가입하려고 하는 사이트에 이미 존재하는 아이디가 주어졌을 때, 
* 놀람을 표현하는 프로그램을 작성하시오.
 */
package test_0413;

import java.util.Scanner;

public class test_0413_2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("id를 입력하세요.");
        String id = scan.next();
        String DB []= {"joonas","baekjoon"};

        for(int i=0; i<DB.length; i++){
            if(DB[i].equals(id)){
                System.out.print(id+"?!");
                return;
            }
        }
        System.out.println(id);
    }
}
