/*  백준 7785번 문제풀이)

    상근이는 세계적인 소프트웨어 회사 기글에서 일한다. 이 회사의 가장 큰 특징은 자유로운 출퇴근 시간이다. 
    따라서, 직원들은 반드시 9시부터 6시까지 회사에 있지 않아도 된다.
    각 직원은 자기가 원할 때 출근할 수 있고, 아무때나 퇴근할 수 있다.
    상근이는 모든 사람의 출입카드 시스템의 로그를 가지고 있다. 
    이 로그는 어떤 사람이 회사에 들어왔는지, 나갔는지가 기록되어져 있다. 
    로그가 주어졌을 때, 현재 회사에 있는 모든 사람을 구하는 프로그램을 작성하시오.

    입력)

    첫째 줄에 로그에 기록된 출입 기록의 수 n이 주어진다. (2 ≤ n ≤ 106) 다음 n개의 줄에는 출입 기록이 순서대로 주어지며, 
    각 사람의 이름이 주어지고 "enter"나 "leave"가 주어진다. "enter"인 경우는 출근, "leave"인 경우는 퇴근이다.
    회사에는 동명이인이 없으며, 대소문자가 다른 경우에는 다른 이름이다. 사람들의 이름은 알파벳 대소문자로 구성된 5글자 이하의 문자열이다.

    출력)

    현재 회사에 있는 사람의 이름을 사전 순의 역순으로 한 줄에 한 명씩 출력한다.
 * 
 */
package test_0526;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class test_0526_1 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("직원수 N을 입력하세요.");
        StringTokenizer st = new StringTokenizer(br.readLine());

        // map(이름,상태)를 담을 map객체 생성
        HashMap <String,String> map = new HashMap<>();
        int N = Integer.parseInt(st.nextToken());

        //N값에 따라 반복문실행. map객체에 이름과 상태를 저장해준다.
        for(int i=0; i<N; i++){
            System.out.println("직원의 이름과 상태를 입력하세요");
            st = new StringTokenizer(br.readLine());
            map.put(st.nextToken(), st.nextToken());
        }

        //나중에 역순으로 정렬해주기 위해 List를 생성하고,
        //keySet()을 통해 map객체에 모든 key값에 접근할 수 있다.
        // map객체에 해당 key의 value값이 enter라면 생성한 member 리스트에 추가해준다.
        // 즉 member 리스트에는 현재 회사에 남아있는 직원들만 저장된다.
        ArrayList <String> member = new ArrayList<>();
        for(String name : map.keySet()){
            if(map.get(name).equals("enter")){
                member.add(name);
            }
        }

        //reverseOrder을 사용하여 리스의 값들을 역순으로 정렬해준다.
        Collections.sort(member,Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        
        //마지막으로 출력을 해준다.
        for(String employee : member){
            sb.append(employee).append("\n");
        }
        System.out.println("결과");
        System.out.print(sb);
    }
}
