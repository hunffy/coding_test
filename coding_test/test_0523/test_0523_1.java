/*  백준 18870번 문제풀이)

    수직선 위에 N개의 좌표 X1, X2, ..., XN이 있다. 이 좌표에 좌표 압축을 적용하려고 한다.
    Xi를 좌표 압축한 결과 X'i의 값은 Xi > Xj를 만족하는 서로 다른 좌표의 개수와 같아야 한다.
    X1, X2, ..., XN에 좌표 압축을 적용한 결과 X'1, X'2, ..., X'N를 출력해보자.

    입력)
    첫째 줄에 N이 주어진다.
    둘째 줄에는 공백 한 칸으로 구분된 X1, X2, ..., XN이 주어진다.

    출력)
    첫째 줄에 X'1, X'2, ..., X'N을 공백 한 칸으로 구분해서 출력한다.
 * 
 */
package test_0523;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class test_0523_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int N = in.nextInt();

        //원본배열과 바꾼배열생성
        int [] origin = new int[N];
        int [] change = new int[N];

        //해쉬맵을 통해 키,밸유값으로 저장하기위해 생성.
        HashMap<Integer,Integer> rankingMap = new HashMap<Integer, Integer>();

        //배열에 입력값 저장
        for(int i=0; i<N; i++){
            change[i]=origin[i]=in.nextInt();
        }

        //ex) 입력값이 2,4,-10,4,-9 라면
        //change배열을 정렬해준다.  -10,-9,2,4,4 형태로 저장된다.
        Arrays.sort(change);

        //rank는 순서값으로 사용한다.
        int rank =0;
        //-10,-9,2,4,4형태로 저장된 change배열을 반복문을통해 v에 주입해준다.
        for(int v : change){
            //containsKey를 통해 rankingMap에 이미 존재하는지, 존재여부를 확인한다
            if(!rankingMap.containsKey(v)){
                //rankingMap에(-10,0),(-9,1)...(4,3) 키와 밸유형태로 저장해준다
                rankingMap.put(v, rank);
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder();

        //origin은 정렬되기전의 값 (2,4,-10,4,-9)의 형태로 순서대로 key에 주입해준다.
        for(int key : origin){
            //ranking은 key에 해당하는 rank를 불러오고
            //해당 값을 sb에 저장해준다.
            //1번째 반복문 : origin의 2          rankingMap.get(2)에 해당하는 rank값 2
            //2번째 반복문 : origin의 4          rankingMap.get(4)에 해당하는 rank값 3
            //3번째 반복문 : origin의 -10        rankingMap.get(-10)에 해당하는 rank값 0
            //4번째 반복문 : origin의 4           rankingMap.get(4)에 해당하는 rank값 3
            //5번째 반복문 : origin의 -9         rankingMap.get(-9)에 해당하는 rank값 1
            int ranking = rankingMap.get(key);

            //sb에 ranking값을 추가해주고,
            sb.append(ranking).append(' ');
        }
        //마지막으로 sb를 출력해주면 결과값을 얻을 수 있다.
        System.out.println(sb);
    }
}
