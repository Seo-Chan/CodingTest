import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());
       int N = Integer.parseInt(st.nextToken());
       int M = Integer.parseInt(st.nextToken());
       int[] card = new int[N];
       st = new StringTokenizer(br.readLine());
       for(int i=0; i<N; i++){
        card[i] = Integer.parseInt(st.nextToken());
       }

       int result = search(N,M,card);
       System.out.println(result);
    }

    public static int search(int N, int M, int[] card){
       int max = 0;
       for(int i=0; i<N-2; i++){
        for(int j=i+1; j<N-1; j++){
            for(int k=j+1; k<N; k++){
                int sum = card[i]+card[j]+card[k];
                if(sum==M) return sum;
                if(sum>max && sum<M) max = sum;
            }
        }
    }
    return max;
}
}
