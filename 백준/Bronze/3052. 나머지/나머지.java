import java.util.Scanner;
import java.util.HashSet;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        HashSet <Integer> res = new HashSet<>();
        
        for(int i=0; i<10; i++){
            res.add(in.nextInt()%42);
        }
        System.out.print(res.size());
    }
}