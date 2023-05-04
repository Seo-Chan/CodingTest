import java.io.IOException;
import java.util.*;
public class Main {
    static int M,N;
    static int[][] map;
    static boolean[][] visited;

    static int[] dx = {1, 0, -1, 0};  // 오른쪽, 아랫쪽, 왼쪽, 윗쪽
    static int[] dy = {0, 1, 0, -1};

    public static void main(String args[]) throws IOException{
    Scanner sc = new Scanner(System.in);
    M = sc.nextInt();
    N = sc.nextInt();
    sc.close();

    map = new int[M][N];
    visited = new boolean[M][N];
    
    int cnt = 0;
    int sum = 0;
    int idx = 0;
    int nowX = 0;
    int nowY = 0;
    
    visited[nowY][nowX] = true;
    sum = 1;

    while(idx < 4){
        int nx = nowX + dx[idx];
        int ny = nowY + dy[idx];

        if(sum == N*M){
            System.out.println(cnt);
            return;
        }

        if(nx >= 0 && ny >=0 && nx < N && ny < M && !visited[ny][nx]) {
            sum++;
            visited[ny][nx] = true;
            nowX = nx;
            nowY = ny;
        }
        else {
            idx++;
            cnt++;
        }

        if(idx >= 4){
            idx = 0;
        }
    }
    }
}