/*  백준 9063번 문제풀이)

    임씨의 이름이 새겨진 옥구슬의 위치 N 개가 주어질 때에, 임씨에게 돌아갈 대지의 넓이를 계산하는 프로그램을 작성하시오. 
    단, 옥구슬의 위치는 2 차원 정수 좌표로 주어지고 옥구슬은 같은 위치에 여러 개가 발견될 수도 있으며, 
    x 축의 양의방향을 동쪽, y 축의 양의방향을 북쪽이라고 가정한다. 
    예를 들어 위와 같이 (2, 1), (3, 2), (5, 2), (3, 4) 네 점에서 옥구슬을 발견하였다면, 
    임씨에게 돌아갈 대지는 (2, 1), (5, 1), (2, 4), (5, 4)를 네 꼭짓점으로 하는 직사각형이며, 넓이는 (5 - 2) × (4 - 1) = 9 가 된다. 

    입력)
    첫째 줄에는 점의 개수 N (1 ≤ N ≤ 100,000) 이 주어진다. 
    이어지는 N 줄에는 각 점의 좌표가 두 개의 정수로 한 줄에 하나씩 주어진다. 
    각각의 좌표는 -10,000 이상 10,000 이하의 정수이다. 

    출력)
    첫째 줄에 N 개의 점을 둘러싸는 최소 크기의 직사각형의 넓이를 출력하시오. 
 * 
 */
package test_0503;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.AbstractMap.SimpleEntry;

import javax.swing.RowFilter.Entry;


public class test_0503_3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("N값을 입력하세요");
        int N = scan.nextInt();
        ArrayList <Map.Entry<Integer,Integer>> N_list = new ArrayList<>();
        
        //N_list에 map객체로써 x와 y값이 들어간다.
        for(int i=0; i<N; i++){
            System.out.print("x와 y값을 입력하세요.");
            int x = scan.nextInt();
            int y = scan.nextInt();
            N_list.add(new SimpleEntry<>(x,y));
        }
        //minX,minY에 MAX_VALUE로 설정해주고
        //maxX,maxY에 MIN_VALUE로 설정해준다.
        int minX = Integer.MAX_VALUE , maxX = Integer.MIN_VALUE;
        int minY = Integer.MAX_VALUE , maxY = Integer.MIN_VALUE;
        
        
        for(Map.Entry<Integer,Integer> entry : N_list){
            //map의 형태는 key,value의 형태이기때문에
            //N_list에 x는 key의값으로 y는 value의 값으로 들어가있기때문에 재설정해준다.
            int x = entry.getKey();
            int y = entry.getValue();
            // 처음 반복문이돌때 minX는 최대값으로 설정되어있기때문에 minX가 크면 x값으로 수정된다.
            // 결국, 반복문이 다 돌게되면 minX는 x값중 최솟값으로 수정된다.
            if(x<minX)  minX=x;
            if(x>maxX)  maxX=x;
            if(y<minY) minY=y;
            if(y>maxY) maxY=y;
        }
        //마지막으로 땅의 넓이를 구하기위해 가장큰값-작은값 * 가장큰값-가장작은값을 해준다.
        int result = (maxX-minX)*(maxY-minY);
        System.out.print(result);
    }
}
