import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        ArrayList <String> res = new ArrayList<>();

        while(st.hasMoreTokens()){
            res.add(st.nextToken());
        }
        System.out.print(res.size());
        
    }
}