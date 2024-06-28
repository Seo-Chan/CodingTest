import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [][] land = new int[3][3];

        for(int i=0; i<3; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<3; j++){
                land[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int max = 10;
        int min = 0;
        int cost = 0;
        int minCost = 10;
        for(int i=0; i<3; i++){
              max = Math.max(Math.max(land[i][0],land[i][1]),land[i][2]);
              min = Math.min(Math.min(land[i][0],land[i][1]),land[i][2]);
            cost = max - min;
            if(cost < minCost){
                minCost = cost;
            }
        }
        for(int i=0; i<3; i++){
              max = Math.max(Math.max(land[0][i],land[1][i]),land[2][i]);
              min = Math.min(Math.min(land[0][i],land[1][i]),land[2][i]);
            cost = max - min;
            if(cost < minCost){
                minCost = cost;
            }
        }

        System.out.println(minCost);
        
      
        


    }
}