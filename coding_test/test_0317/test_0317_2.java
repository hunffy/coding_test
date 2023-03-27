
package test_0317;
import java.util.Scanner;

public class test_0317_2 {
    public static void main(String[] args){
    //1. 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램 작성해보기.
    /* 
        1. A가 B보다   큰 경우에는 '>' 를 출력한다.
        2. A가 B보다 작은 경우에는 '<' 를 출력한다.
        3. A와 B가  같은 경우에는 '=' 를 출력한다.
    */

    Scanner scan = new Scanner(System.in);
    System.out.println("A값을 입력하세요.");
    int A = scan.nextInt();
    System.out.println("B값을 입력하세요.");
    int B = scan.nextInt();

    if(A>B){
        System.out.println(">");        
    }else if(A<B){
        System.out.println("<");
    }else{
        System.out.println("=");
    }
    scan.close();
    }
}