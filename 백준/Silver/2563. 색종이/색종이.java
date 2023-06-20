import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int arr[][] = new int [100][100];

        for(int i=0; i<N; i++){
            int x = in.nextInt();
            int y = in.nextInt();        
            
            for(int a=x; a<x+10; a++){
                for(int b=y; b<y+10; b++){
                    arr[a][b]=1;
                }
            }   
        }
        int cnt = 0;
        for(int i=0; i<100; i++){
            for(int j=0; j<100; j++){
                if(arr[i][j]==1){
                    cnt++;
                }
            }
        }
        in.close();
        System.out.print(cnt);
   }
}