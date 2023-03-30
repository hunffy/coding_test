/*
 * """
입력:5

출력:
    *           1
   ***          3
  *****         5
 *******        7
*********       9 
 *******        7 
  *****         5
   ***          3
    *           1
 */

package test_0330;

import java.util.Scanner;

public class test_0330_4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 입력하세요.");
        int N = scan.nextInt();

        for(int i=0; i<N-1; i++){
            for(int j=i; j<N-1; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=2*i+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1; i<N+1; i++){
            for(int k=1; k<i; k++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*N-(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
