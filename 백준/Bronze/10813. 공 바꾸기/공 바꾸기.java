import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt() , M = in.nextInt();
        int [] N_list = new int[N+1];
        
        for(int i=1; i<=N; i++){
            N_list[i]=i;
        }
        for(int a=1; a<=M; a++){
            int i = in.nextInt(), j = in.nextInt();
            int first = N_list[i];
            N_list[i]=N_list[j];
            N_list[j]=first;
        }
        for(int i=1; i<=N; i++){
            System.out.print(N_list[i]+" ");
        }
    }
}