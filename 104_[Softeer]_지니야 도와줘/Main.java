import java.io.*;
import java.util.*;

public class Main {

   public static void main(String args[]) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());
       
       int R = Integer.parseInt(st.nextToken());
       int C = Integer.parseInt(st.nextToken());
       
       char [][] map = new char[R][C];
       Queue<int []> wQ = new LinkedList<>();
       Queue<int []> rQ = new LinkedList<>();
       boolean [][] wVisited = new boolean[R][C];
       boolean [][] rVisited = new boolean[R][C];
       int [] dx = {-1,0,1,0};
       int [] dy = {0,1,0,-1};
       int hX=-1,hY=-1;
       for(int i=0; i<R; i++){
          String input = br.readLine();
          for(int j=0; j<C; j++){
             map[i][j] = input.charAt(j);
             if(map[i][j] =='H'){
                hX = i;
                hY = j;
             }
             if(map[i][j] =='W'){
                wQ.add(new int[]{i,j});
                wVisited[i][j] = true;
             }
             if(map[i][j] == '*'){
                rQ.add(new int[]{i,j});
                rVisited[i][j] = true;
             }
          }
       }
       int result = 0;
       while(!wQ.isEmpty()){
          int rSize = rQ.size();
          for(int i=0; i<rSize; i++){
             int [] cur = rQ.poll();
             int curX = cur[0];
             int curY = cur[1];
             
             for(int j=0; j<4; j++){
                int newX = curX+dx[j];
                int newY = curY+dy[j];
                if(newX>=0 && newX<R && newY>=0 && newY<C 
                      && !rVisited[newX][newY] && map[newX][newY] != 'X' && map[newX][newY] != 'H'){
                   rVisited[newX][newY]= true;
                   rQ.add(new int[]{newX,newY});
                }
             }
          }
          
          int wSize = wQ.size();
          for(int i=0; i<wSize; i++){
             int [] cur = wQ.poll();
             int curX = cur[0];
             int curY = cur[1];
             
             if(curX ==hX && curY == hY){
                System.out.println(result);
                return;
             }
             
             for(int j=0; j<4; j++){
                int newX = curX+dx[j];
                int newY = curY+dy[j];
                if(newX>=0 && newX<R && newY>=0 && newY<C 
                      && !wVisited[newX][newY] && !rVisited[newX][newY] && map[newX][newY] != 'X'){
                   wVisited[newX][newY]= true;
                   wQ.add(new int[]{newX,newY});
                }
             }   
          }
          
          result++;
       }
       
       System.out.println("FAIL");
       
   }
}
