import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
    static int N;
    static int[][] map;
    static boolean[][] isVisited;
    static int[] dx = {1, 0, -1, 0}; //남동북서 복뚱남서연
    static int[] dy = {0, 1, 0, -1};
    static int num = 0;
    static int [] cnt = new int [626];

    
    public static void doFind(int X, int Y){
       isVisited[X][Y] = true;
      cnt[num]++;
       Queue<int[]> q = new LinkedList<>();
       q.add(new int[]{X,Y});

       while(!q.isEmpty()){
          int [] cur = q.poll();
          int curX = cur[0];
          int curY = cur[1];
  
          for(int i=0; i<4; i++){
              int newX = curX+dx[i];
              int newY = curY+dy[i];
              
              if(newX>=0 && newX <N && newY>=0 && newY<N && map[newX][newY] ==1 && !isVisited[newX][newY] ){
                 isVisited[newX][newY] = true;
                 cnt[num]++;
                 q.add(new int[]{newX,newY});
              }
           }
       }
       
    }
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        isVisited = new boolean[N][N];
        for(int i=0; i<N; i++){
            String str = br.readLine();
            for(int j=0; j<N; j++){
                map[i][j]=str.charAt(j)-'0';
            }
        }
                        
        while(true){
           boolean isRemain = false;
           int curX =0;
           int curY =0;
           for(int i=0; i<N; i++){
              if(isRemain) break;
              for(int j=0; j<N; j++){
                  if(!isVisited[i][j] && map[i][j] ==1){
                     curX = i;
                     curY = j;
                     isRemain = true;
                     break;
                  }
               }
           }
           if(!isRemain) break;
           num++;
           doFind(curX, curY);
        }

        System.out.println(num);
        Arrays.sort(cnt);
        if(num >0){
           for(int i=0; i<cnt.length; i++){
              if(cnt[i]>0)System.out.println(cnt[i]);
           }
        }
        
    }
}