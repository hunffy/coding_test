import java.util.Scanner;

public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String res = "";
        for(int i=0; i<a.length(); i++){
            if('a'<=a.charAt(i) && a.charAt(i)<='z'){
                res += (char)(a.charAt(i) - 32);
            }else if('A'<=a.charAt(i) && a.charAt(i)<='Z'){
                res += (char)(a.charAt(i) + 32) ;
            }
        }
        System.out.print(res);
    }
}