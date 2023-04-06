
package test_0406;

import java.util.Scanner;

public class test_0406_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ans = 0;
        System.out.println("수 N을 입력하세요.");
        String N = scan.next();
        System.out.println("진법 B를 입력해주세요.");
        int B = scan.nextInt();
        for(int i=0; i<N.length(); i++) {
            if('0' <= N.charAt(i) && '9'>=N.charAt(i))
                ans = ans*B+(N.charAt(i)-'0');
            else
                ans = ans*B+(N.charAt(i)-'A'+10);
        }
        System.out.println(N+"의 10진법 결과:"+ans);
    }
}
