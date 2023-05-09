import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static int[] dp;

    public static int tile01(int N) {
        if (N == 1) {
            dp[N] = 1;
            return dp[N];
        }
        else if (N == 2) {
            dp[N] = 2;
            return dp[N];
        }
        
        if (dp[N] == 0) {//N경우의수를 구한적 없었을때
            dp[N] = (tile01(N - 1) + tile01(N - 2))%15746;
        }
        
        return dp[N];
    }
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        dp = new int[N+1];// N자리수 경우의수 구한걸 저장해놓는 배열.
        System.out.println(tile01(N));//N자리수 경우의수

    
    }
}