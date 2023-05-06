import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
   public static void main(String args[]) throws Exception{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int N = Integer.parseInt(br.readLine());
      
      StringTokenizer st = new StringTokenizer(br.readLine());
      int [] dist = new int [N];//cost[n] 은 n-1-> n 가는 비용
      for(int i=1; i<N; i++){
         dist[i] = Integer.parseInt(st.nextToken());
      }
      
      st = new StringTokenizer(br.readLine());
      int [] cost = new int [N];
      
      for(int i=0; i<N; i++){
         cost[i] = Integer.parseInt(st.nextToken());
      }
      int minCost = cost[0]; 
      long result = 0;
      
      for(int i=1; i<N; i++){
         if(cost[i] <minCost) {
            result += (long)minCost*dist[i];
            minCost = cost[i];
         }else{
            result += minCost*dist[i];
         }
      }
      System.out.println(result);
   }
}