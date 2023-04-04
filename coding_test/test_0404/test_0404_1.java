//2차원배열 입력된값을 세로로 출력하기
/*   ex) 입력
         abcde
         fghij
         klmop
         qrstu
         vwxyz
 * 
 *      출력
 *      afkqvbglrwchmsxdiotyejpuz
 */
package test_0404;

import java.util.Scanner;

public class test_0404_1 {
    public static void main(String[] agrs){
        Scanner scan = new Scanner(System.in);
        String [][] arr = new String [5][5];

        for(int i=0; i<5; i++){
            System.out.println(i+"번째");
            for(int j=0; j<5; j++){
                System.out.print("배열의 값을 입력해주세요.");
                arr[i][j] = scan.next();
            }
        }
        for(int j=0; j<5; j++){
            for(int i=0; i<5; i++){
                System.out.print(arr[i][j]);
            }
        }
    }
}
