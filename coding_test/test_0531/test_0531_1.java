/*  백준 10816번 문제풀이)
    
    숫자 카드는 정수 하나가 적혀져 있는 카드이다. 
    상근이는 숫자 카드 N개를 가지고 있다. 정수 M개가 주어졌을 때, 
    이 수가 적혀있는 숫자 카드를 상근이가 몇 개 가지고 있는지 구하는 프로그램을 작성하시오.

    입력)
    첫째 줄에 상근이가 가지고 있는 숫자 카드의 개수 N(1 ≤ N ≤ 500,000)이 주어진다. 
    둘째 줄에는 숫자 카드에 적혀있는 정수가 주어진다. 숫자 카드에 적혀있는 수는 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다.
    셋째 줄에는 M(1 ≤ M ≤ 500,000)이 주어진다. 
    넷째 줄에는 상근이가 몇 개 가지고 있는 숫자 카드인지 구해야 할 M개의 정수가 주어지며, 이 수는 공백으로 구분되어져 있다. 이 수도 -10,000,000보다 크거나 같고, 10,000,000보다 작거나 같다.

    출력)
    첫째 줄에 입력으로 주어진 M개의 수에 대해서, 각 수가 적힌 숫자 카드를 상근이가 몇 개 가지고 있는지를 공백으로 구분해 출력한다.
 * 
 */
package test_0531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class test_0531_1 {
    public static void main(String[] args)throws IOException,NullPointerException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("N값을 입력하세요.");
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        HashMap <Integer,Integer> map = new HashMap <>();

        System.out.println("카드의 숫자들을 입력하세요");
        st = new StringTokenizer(br.readLine(), " ");

        for(int i=0; i<N; i++){
            int input = Integer.parseInt(st.nextToken());
             // getOrdefalult("키값",0) => 키값이 존재하면 키값에 해당하는 밸유값 리턴 , 없다면 0리턴
            // 즉 입력값이 map객체에 없으면 +1증가 , 있으면 해당 밸유값에서 +1증가
            //ex) input = 1 1 2 3 5 가 입력.
            //   1번째) 1은 map객체에 존재x -> 0+1 =1.
            //   2번째) 1은 map객체에 존재o -> 1의 밸유값 1리턴 -> 1+1 =2
            //   3번째) 2는 map객체에 존재x -> 0+1 =1.
            map.put(input,map.getOrDefault(input, 0)+1);
        }

        System.out.println("조회 할 카드 갯수 M값을 입력하세요.");
        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        
        System.out.println("카드 숫자를 입력하세요");
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<M; i++){
            int input2 = Integer.parseInt(st.nextToken());
            //map객체에 input2 키값이 존재하면 input2키값에 해당하는 밸유값리턴. 없다면 0 리턴
            //ex) input2 = 1,2,7
            // 1번째) map객체에 1은 존재 1의 value값 2를 리턴.
            // 2번째) map객체에 2는 존재 2의 value값 1을 리턴
            // 3번째) map객체에 7은 존재하지않음. 0으로 리턴.
            int res = map.getOrDefault(input2, 0);
            sb.append(res).append(" ");
        }
        System.out.print(sb);
	}
}

