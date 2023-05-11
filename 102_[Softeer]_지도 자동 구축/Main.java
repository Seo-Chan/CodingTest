import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 0;
        int[] dot = new int[N+1];
        dot[0] = 2;
        for(int i=1; i<=N; i++){
        dot[i] = dot[i-1] + (dot[i-1]-1);
        }
        result = dot[N] * dot[N];
        System.out.println(result);
    }
}
