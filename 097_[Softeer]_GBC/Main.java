package 097_[Softeer]_GBC;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());
       
       int N = Integer.parseInt(st.nextToken());
       int M = Integer.parseInt(st.nextToken());
       
       int [] limit = new int [101];
       int cur = 0;
       for(int i=0; i<N; i++){
          st = new StringTokenizer(br.readLine());
          int length = Integer.parseInt(st.nextToken());
          int speed = Integer.parseInt(st.nextToken());
          for(int j=cur+1; j<=cur+length; j++){
             limit[j] = speed;
          }
          cur += length;
       }
       int maxOver = 0;
       cur =0;
       for(int i=0; i<M; i++){
          st = new StringTokenizer(br.readLine());
          int length = Integer.parseInt(st.nextToken());
          int speed = Integer.parseInt(st.nextToken());
          for(int j=cur+1; j<=cur+length; j++){
             if(maxOver < speed-limit[j]){
                maxOver = speed-limit[j];
             }
          }
          cur += length;
       }
       System.out.println(maxOver);
 
    }
 }
