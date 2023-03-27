import java.util.Scanner;

/*
  3개의 주사위를 던져 규칙에 따라 상금을 받는 게임.


1.같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 
2.같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
3.모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.

ex) 3,3,3  => 10,000 + (3) x 1,000 = 13,000원
ex) 3,3,6  => 1,000 + (3) x 100    = 1,300원
ex) 1,3,6  => (6) x 100 = 600원

 */
public class test_0326_3 {
    public static void main(String[] args){
        System.out.println("A,B,C를 입력하세요.");
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
    
        if(A==B && B==C){
            System.out.println(10000+(A*1000)+"원");
        }else if(A==B || A==C){
            System.out.println(1000+(A*100)+"원");
        }else if(B==C){
            System.out.println(1000+(B*100)+"원");
        }else{
            int res1 = Math.max(A,B);
            int res2 = Math.max(B,C);
            System.out.println(Math.max(res1,res2)*100+"원");
        }

    }

}
