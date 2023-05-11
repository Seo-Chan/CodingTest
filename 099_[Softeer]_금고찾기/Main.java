import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        LinkedList<int[]> list = new LinkedList<>();
        int W = Integer.parseInt(st.nextToken());
        long N = Integer.parseInt(st.nextToken());
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            list.add(new int[]{Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())});
        }
        Collections.sort(list, new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2){
                return (o1[1] - o2[1])*-1;
            }
        });
        int result = 0;
        int curW = W;
            for(int i=0; i<N; i++){
                if(curW-list.get(i)[0]>=0){
                    result += (list.get(i)[0] * list.get(i)[1]);
                    curW -= list.get(i)[0];
                }else if(curW<list.get(i)[0] && curW!=0){
                    result += (curW * list.get(i)[1]);
                    curW = 0;
                }else break;
                if(curW==0) break;
        }
        System.out.println(result);
    }
}
