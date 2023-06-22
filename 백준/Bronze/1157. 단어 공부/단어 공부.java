import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        
        int arr [] = new int [26];
        
        for(int i=0; i<s.length(); i++){
            if('A'<=s.charAt(i) && s.charAt(i)<='Z'){
                arr[s.charAt(i)-65]++;
            }else{
                arr[s.charAt(i)-97]++;
            }
        }
        
        int max = -1;
        char ch = '?';
        
        for(int i=0; i<26; i++){
            if(arr[i]>max){
                max = arr[i];
                ch = (char)(i+65);
            }else if(arr[i]==max){
                ch='?';
            }
        }
        System.out.print(ch);
    }
}