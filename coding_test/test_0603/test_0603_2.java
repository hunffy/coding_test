/*  백준 1269번 문제풀이)

    자연수를 원소로 갖는 공집합이 아닌 두 집합 A와 B가 있다. 이때, 두 집합의 대칭 차집합의 원소의 개수를 출력하는 프로그램을 작성하시오. 
    두 집합 A와 B가 있을 때, (A-B)와 (B-A)의 합집합을 A와 B의 대칭 차집합이라고 한다.
    예를 들어, A = { 1, 2, 4 } 이고, B = { 2, 3, 4, 5, 6 } 라고 할 때,  A-B = { 1 } 이고, B-A = { 3, 5, 6 } 이므로, 대칭 차집합의 원소의 개수는 1 + 3 = 4개이다.

    입력)

    첫째 줄에 집합 A의 원소의 개수와 집합 B의 원소의 개수가 빈 칸을 사이에 두고 주어진다. 
    둘째 줄에는 집합 A의 모든 원소가, 셋째 줄에는 집합 B의 모든 원소가 빈 칸을 사이에 두고 각각 주어진다. 
    각 집합의 원소의 개수는 200,000을 넘지 않으며, 모든 원소의 값은 100,000,000을 넘지 않는다.

    출력)
    첫째 줄에 대칭 차집합의 원소의 개수를 출력한다.

 * 
 */
package test_0603;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class test_0603_2 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] Input = br.readLine().split(" ");
        int A = Integer.parseInt(Input[0]);
        int B = Integer.parseInt(Input[1]);

        HashSet <Integer> A_list = new HashSet<>();
        HashSet <Integer> B_list = new HashSet<>();

        String [] a_ele = br.readLine().split(" ");
        for(String a : a_ele){
            int num = Integer.parseInt(a);
            A_list.add(num);
        }

        String [] b_ale = br.readLine().split(" ");
        for(String b : b_ale){
            int num2 = Integer.parseInt(b);
            B_list.add(num2);
        }

        HashSet <Integer> res = new HashSet<>(A_list);
        res.addAll(B_list);
        
        for(int n1 : A_list){
            if(B_list.contains(n1)){
                res.remove(n1);
            }
        }

        int result = res.size();
        System.out.print(result);
    }
}
