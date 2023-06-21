import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        for(int i=0; i<t; i++){
            String s = in.next();
            System.out.print(s.charAt(0));
            System.out.print(s.charAt(s.length()-1));
            System.out.println(" ");
        }
    }
}