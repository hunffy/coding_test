/*  백준 5073번 문제풀이)
    삼각형의 세 변의 길이가 주어질 때 변의 길이에 따라 다음과 같이 정의한다.

    Equilateral :  세 변의 길이가 모두 같은 경우
    Isosceles : 두 변의 길이만 같은 경우
    Scalene : 세 변의 길이가 모두 다른 경우
    단 주어진 세 변의 길이가 삼각형의 조건을 
    만족하지 못하는 경우에는 "Invalid" 를 출력한다. 
    예를 들어 6, 3, 2가 이 경우에 해당한다. 
    가장 긴 변의 길이보다 나머지 두 변의 길이의 합이 길지 않으면 
    삼각형의 조건을 만족하지 못한다.

    세 변의 길이가 주어질 때 위 정의에 따른 결과를 출력하시오.

 * 
 */
package test_0503;


import java.util.Scanner;

public class test_0503_5 {
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);

       int [] arr = new int[3];
       int max = 0;

       while(true){
        System.out.println("각 변의 길이를 입력하세요.");
        arr[0] = scan.nextInt();
        arr[1] = scan.nextInt();
        arr[2] = scan.nextInt();

        //0 , 0, 0 입력시 종료가된다.
        if(arr[0]==0&& arr[1]==0 && arr[2]==0){
            break;
        }

        //최댓값을 구하는부분.
        //max 초기값은 0 
        // 0과 각요소들을 비교하여 max보다크면 그 요소가 최댓값이된다.
        // 배열의 길이만큼 반복문을 반복하여 max에는 최댓값이 저장된다.
        for(int i=0; i<arr.length; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        // 조건문을통해 조건문에 해당하는 출력값이 출력된다.
        // 주의할점은 위에서부터 조건문이 실행되므로
        // Invalid조건문을 두번째에 위치해준다.
        
        if (arr[0]==arr[1] && arr[1]==arr[2]){
            System.out.println("Equilateral");
        }else if(max>= arr[0]+arr[1] || max>= arr[1]+arr[2] ||max>= arr[0]+arr[2] ){
            System.out.println("Invalid");
        }else if(arr[0]==arr[1] || arr[1]== arr[2] || arr[0]==arr[2]){
            System.out.println("Isosceles");
        }else if(max < arr[0]+arr[1] && max < arr[1]+arr[2] && max < arr[0]+arr[2]){
            System.out.println("Scalene");
        }else{
            System.out.println("Invalid");
        }
       }
    }
}
