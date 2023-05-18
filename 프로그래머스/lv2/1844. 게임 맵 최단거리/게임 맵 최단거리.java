import java.util.*;

class Solution {
    int[] dx = {-1, 0, 1, 0}; //북동남서
    int[] dy = {0, 1, 0, -1};
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        boolean[][] isVisited = new boolean[n+1][m+1];
        Queue<int[]> q = new LinkedList<>();
        int curX = 0;
        int curY = 0;
        int[][] cnt = new int[n+1][m+1]; 
        
        isVisited[curX][curY] = true;
        q.add(new int[] {curX, curY});
        cnt[curX][curY] = 1;
        
        while(!q.isEmpty()){
            int[] cur = q.poll();
            curX = cur[0];
            curY = cur[1];
            for(int i=0; i<4; i++){
                int newX = curX + dx[i];
                int newY = curY + dy[i];
                if(
                   newX>=0 && 
                   newY>=0 && 
                   newX<n && 
                   newY<m &&
                    !isVisited[newX][newY] && 
                   maps[newX][newY]==1){
                    isVisited[newX][newY] = true;
                    cnt[newX][newY] = cnt[curX][curY]+1;
                    q.add(new int[] {newX, newY});
                }
            }
        }
        return !isVisited[n-1][m-1] ? -1 : cnt[n-1][m-1];
    }
}