import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = "";
        for(int i=0; i<8; i++){
            str += st.nextToken();
        }
        if(str.contains("12345678")) System.out.println("ascending");
        else if(str.contains("87654321")) System.out.println("descending");
        else System.out.println("mixed");
}
}