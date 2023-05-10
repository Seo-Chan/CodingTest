package 098_[Softeer]_바이러스;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        long result = 0;
        long pow = K;
        for(int i=1; i<=N; i++){
            pow = (pow% 1000000007) * (P% 1000000007) % 1000000007;
        }
         result = pow % 1000000007;
         System.out.println(result);
    }
}
