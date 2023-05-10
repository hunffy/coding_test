/*  백준 19532번 문제풀이
    
    ax+by=c
    dx+ey=f

    입력)
    a,b,c,d,e,f가 주어진다.

    출력)
    x,y값이 출력된다.
 * 
 */
package test_0510;

import java.util.Scanner;

public class test_0510_1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("a값");
        int a = scan.nextInt();
        System.out.println("b값");
        int b = scan.nextInt();
        System.out.println("c값");
        int c = scan.nextInt();
        System.out.println("d값");
        int d = scan.nextInt();
        System.out.println("e값");
        int e = scan.nextInt();
        System.out.println("f값");
        int f = scan.nextInt();
        int x = 0;
        int y = 0;
        for(int i=-999; i<1000; i++){
            for(int j=-999; j<1000; j++){
                if((a*i+b*j==c) && (d*i+e*j==f)){
                    x = i;
                    y = j;
                    break;
                }
            }
        }
        System.out.print(x + " "+ y);
    }
}
