import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int [] B = {1,1,2,2,2,8};
        int [] W = new int [6];
        for(int i=0; i<6; i++){
            W[i]=in.nextInt();
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<6; i++){
            if(B[i]-W[i]==0){
                sb.append(B[i]-W[i]).append(" ");
            }else if(B[i]-W[i]>0){
                sb.append(B[i]-W[i]).append(" ");
            }else{
                sb.append(B[i]-W[i]).append(" ");
            }
        }
        System.out.print(sb);
    }
}