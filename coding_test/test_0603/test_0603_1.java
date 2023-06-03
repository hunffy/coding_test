/*  백준 1764번 문제풀이)

    김진영이 듣도 못한 사람의 명단과, 보도 못한 사람의 명단이 주어질 때, 듣도 보도 못한 사람의 명단을 구하는 프로그램을 작성하시오.

    입력)
    첫째 줄에 듣도 못한 사람의 수 N, 보도 못한 사람의 수 M이 주어진다. 
    이어서 둘째 줄부터 N개의 줄에 걸쳐 듣도 못한 사람의 이름과, N+2째 줄부터 보도 못한 사람의 이름이 순서대로 주어진다. 
    이름은 띄어쓰기 없이 알파벳 소문자로만 이루어지며, 그 길이는 20 이하이다. N, M은 500,000 이하의 자연수이다.
    듣도 못한 사람의 명단에는 중복되는 이름이 없으며, 보도 못한 사람의 명단도 마찬가지이다.

    출력)
    듣보잡의 수와 그 명단을 사전순으로 출력한다.
 * 
 */
package test_0603;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class test_0603_1 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("N,M값 입력");
        String [] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        HashSet <String> listen = new HashSet<>();

        //HashSet에 N명에 해당하는 듣도 못한사람들을 입력시킨다.
        for(int i=0; i<N; i++){
            System.out.println("듣도 못한사람 입력");
            listen.add(br.readLine());
        }

        ArrayList <String> result = new ArrayList<>();
        //보도못한사람들을 입력하고, 듣도못한사람에도 해당된다면 result 리스트에 추가시켜준다.
        for(int i=0; i<M; i++){
            System.out.println("보도 못한사람 입력");
            String see = br.readLine();
            if(listen.contains(see)){
                result.add(see);
            }
        }
        //사전순으로 출력하기위해 정렬해준다.
        Collections.sort(result);
        
        //둘다 해당되는 사람의 수를 출력해준다.
        System.out.println(result.size());

        //result 리스트에 저장된 두개그룹 모두 해당하는 사람들을 출력시켜준다.
        for(String r : result){
            System.out.println(r);
        }
    }
}
