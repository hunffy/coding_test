import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int [] complet = new int [31];
        
        for(int i=1; i<=28; i++){
            int n = in.nextInt();
            complet[n]=1;
        }
        
        for(int i=1; i<complet.length; i++){
            if(complet[i]!=1){
                System.out.println(i);
            }
        }
    }
}