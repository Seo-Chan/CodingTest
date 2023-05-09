import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.Stack;

public class Main {
    static Stack<Integer> stc = new Stack<>();
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++){
            String run = br.readLine();
            int num = 0;
            if(run.contains("push")){
                StringTokenizer st = new StringTokenizer(run);
                run = st.nextToken();
                num = Integer.parseInt(st.nextToken());
                stc.push(num);
            }
                if(run.equals("top")){
                if(!stc.isEmpty()) sb.append(stc.peek()).append("\n");
                else sb.append("-1").append("\n");
            }else if(run.equals("size")) sb.append(stc.size()).append("\n");
            else if(run.equals("empty")){
                if(!stc.isEmpty()) sb.append("0").append("\n");
                else sb.append("1").append("\n");
        }else if(run.equals("pop")){
            if(!stc.isEmpty()) sb.append(stc.pop()).append("\n");
            else sb.append("-1").append("\n");
        }
    }
    System.out.println(sb);
}
}