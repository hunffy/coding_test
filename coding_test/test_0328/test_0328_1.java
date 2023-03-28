package test_0328;

import java.util.Scanner;

/*
원하는 숫자의 갯수 출력하는 프로그램 만들기

1. 1~100까지의 원하는 갯수 N을 입력한다.

2.  N개에 해당하는 숫자들이 입력된다.

3. 숫자들중 원하는 숫자 V를 입력한다.

4. 결과 : 원하는 숫자 V의 갯수를 출력해준다.


ex) 1. 5입력
    2. 1 1 2 3 2
    3. 1
    4. 결과: 숫자1의 갯수 2개가 출력된다
 */
public class test_0328_1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("원하는 갯수 N을 입력하세요.");
        int N = scan.nextInt();
        int cnt = 0;
        int [] N_list = new int[N];
        for(int i=0; i<N; i++){
            System.out.print("숫자를 입력하세요.");
            N_list[i]=scan.nextInt();
        }
        System.out.print("알고싶은 숫자V를 입력해주세요");
        int V = scan.nextInt();

        for (int i=0; i<N_list.length; i++){
            if(N_list[i]==V){
                cnt++;
            }
        }
    System.out.println("V의 갯수는"+cnt);
    }
}
