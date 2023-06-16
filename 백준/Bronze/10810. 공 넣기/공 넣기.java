import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int [] n_list = new int[n+1];
        
        for(int a=0; a<m; a++){
            int i = in.nextInt();
            int j = in.nextInt();
            int k = in.nextInt();
            for(int b=i; b<=j; b++){
                n_list[b]=k;
            }
        }
        for(int c=1; c<=n; c++){
            System.out.print(n_list[c]+" ");
        }
    }
}