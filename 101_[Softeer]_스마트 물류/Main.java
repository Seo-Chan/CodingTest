import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());
       
       int N = Integer.parseInt(st.nextToken());
       int K = Integer.parseInt(st.nextToken());
 
       String input = br.readLine();
       
       boolean [] isUsed = new boolean[N];
       int result = 0;
       
       for(int i=0; i<N; i++){
          if(input.charAt(i) =='P'){//로봇이 나왔을때
             for(int j=(i-K)<0? 0 : (i-K); (j<=i+K)&&(j<N) ; j++){
                if(input.charAt(j) == 'H' && !isUsed[j]) {
                   isUsed[j] = true;
                   result ++;
                   break;
                }
             }
          }
