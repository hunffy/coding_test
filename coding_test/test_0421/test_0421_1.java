/*  백준 1193번 문제풀이)

 *  문제)
 *  이와 같이 나열된 분수들을 1/1 → 1/2 → 2/1 → 3/1 → 2/2 → … 과 같은 지그재그 순서로 차례대로 1번, 2번, 3번, 4번, 5번, … 분수라고 하자.
    X가 주어졌을 때, X번째 분수를 구하는 프로그램을 작성하시오.

    입력)
    첫째 줄에 X(1 ≤ X ≤ 10,000,000)가 주어진다.

    출력)
    첫째 줄에 분수를 출력한다.
 */
package test_0421;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class test_0421_1 {
    public static void main(String[] args) throws NumberFormatException, IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int X = Integer.parseInt(br.readLine()); // 주어진 숫자 X
		int floor = 1; // 주어진 숫자 X가 위치한 층 수
		int room = 1; // 주어진 숫자 X가 위치한 방의 위치(몇번째 인가?)
		while (true) { // 층 수 구하기
			if (X <= (floor * (floor + 1)) / 2) { // 분수 갯수의 합이 X를 넘을 때가 층의 위치
				room = X - (floor * (floor - 1)) / 2; // 방의 위치 구하기
				break; // 루프 빠져 나옴
			} else { // 아니면
				floor++; // 층 수 늘리기
			}
		}
		
		if(floor % 2 == 0) { // 층의 위치가 짝수일 때
			bw.write(room + "/" + (floor - (room - 1)));
		}else { // 층의 위치가 홀수일 때
			bw.write((floor - (room - 1)) + "/" + room);	
		}

		br.close();
		bw.flush();
		bw.close();
	}
}
