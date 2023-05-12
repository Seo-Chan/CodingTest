import java.util.*;
import java.io.*;

public class Main {
    public static int [] dx = {-1,0,1,0};
    public static int [] dy = {0,1,0,-1};
    
    public static void main(String args[]) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int [][] map = new int[N][M];
        
        for(int i=0; i<N; i++){
           st = new StringTokenizer(br.readLine());
           for(int j=0; j<M; j++){
              map[i][j] = Integer.parseInt(st.nextToken());
           }
        }
        int result= 0;
        while(true){
           boolean [][] isVisited = new boolean[N][M];
           //1 -> 얼음 /0 -> 공기 / -1 ->외부공기
           //1. 외부공기 체크
           Queue<int[]> q = new LinkedList<>();
           q.add(new int[]{0,0});
           isVisited[0][0] = true;
           map[0][0] = -1;
           while(!q.isEmpty()){
              int [] cur = q.poll();
              int curX = cur[0];
              int curY = cur[1];
              
              for(int i=0; i<4; i++){
                 int newX = curX+dx[i];
                 int newY = curY+dy[i];
                 
                 if(newX>=0 && newX<N && newY>=0 && newY<M &&
                    !isVisited[newX][newY] && map[newX][newY] <=0){
                    isVisited[newX][newY] = true;
                    q.add(new int[]{newX,newY});
                    map[newX][newY] = -1;
                 }
              }
           }
           //2. 외부공기와 맞닿은곳 체크
           boolean isRemain =false;
           for(int i=0; i<N; i++){
              for(int j=0; j<M; j++){
                 if(map[i][j] ==1){
                    isRemain =true;
                    int count =0;//맞닿은 면의 개수 
                    
                    for(int k=0; k<4; k++){
                       int newX = i+dx[k];
                       int newY = j+dy[k];
                       if(map[newX][newY] ==-1){
                          count++;
                       }
                    }
                    if(count>=2){
                       map[i][j] =2;//맞닿은곳
                    }
                    
                 }
              }
           }
           //3. 외부공기와 맞닿은곳 녹임처리
           for(int i=0; i<N; i++){
              for(int j=0; j<M; j++){
                 if(map[i][j] ==2) map[i][j] =-1;
              }
           }   
           
           if(!isRemain) break;
           result++;
           
        }
        
        System.out.println(result);
           
    
    }
 }