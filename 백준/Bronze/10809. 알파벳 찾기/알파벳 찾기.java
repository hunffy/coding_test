import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int [] res = new int [26];
        
        for(int i=0; i<res.length; i++){
            res[i]=-1;
        }
        
        String s = in.next();
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(res[ch-'a']==-1){
                res[ch-'a']=i;
            }
        }
        for(int res1:res){
            System.out.print(res1 + " ");
        }
    }
}