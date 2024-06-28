import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        String secretNumber = br.readLine();
        String userNumber = br.readLine();

        if(userNumber.contains(secretNumber)){
            System.out.println("secret");
        }else System.out.println("normal");
    }
}