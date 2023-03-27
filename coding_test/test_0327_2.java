import java.util.Scanner;

/*  num값을 입력받아, 구구단 출력하기.
    num=5
    5 * 1 = 5
    5 * 2 = 10
    5 * 3 = 15
    5 * 4 = 20
    5 * 5 = 25
    5 * 6 = 30
    5 * 7 = 35
    5 * 8 = 40
    5 * 9 = 45

 */
public class test_0327_2{
    public static void main(String[] args){
        System.out.println("원하는 구구단 숫자를 입력하세요.");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for (int i=1; i<10; i++){
            System.out.println(num+"*"+i+"="+num*i);
        }
    }
}
