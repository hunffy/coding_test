import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int [] num = new int [n+1];
        for(int i=1; i<=n; i++){
            num[i]=i;
        }
        int temp = 0;
        for(int i=0; i<m; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            while(a<b){
                temp = num[a];
                num[a] = num[b];
                num[b]  = temp;
                a++;
                b--;
            }
        }
        for(int i=1; i<=n; i++){
            System.out.print(num[i] + " ");
        }
    }
}