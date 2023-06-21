import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        String s = in.next();
        int sum = 0;
        for(int i=0; i<t; i++){
            sum+=s.charAt(i)-48;
        }
        System.out.print(sum);
    }
}