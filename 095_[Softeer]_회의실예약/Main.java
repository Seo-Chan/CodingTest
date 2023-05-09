import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        HashMap<String, Integer> map = new HashMap<>();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        boolean[][] timeTable = new boolean[N][19];
        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            map.put(name, i);
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int startTime = Integer.parseInt(st.nextToken());
            int endTime = Integer.parseInt(st.nextToken());

            for (int j = startTime; j < endTime; j++) {
                timeTable[map.get(name)][j] = true;
            }
        }
        LinkedList<String> list = new LinkedList<>(map.keySet());

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            if(i>0) System.out.println("-----");
            System.out.println("Room " + list.get(i) + ":");
            boolean curStat = true;
            StringBuilder sb = new StringBuilder();
            int count = 0;
            boolean isStart = false;
            for (int j = 9; j <= 18; j++) {
                boolean isReserved = timeTable[map.get(list.get(i))][j];
                if (curStat != isReserved) {
                    if (curStat && !isReserved && j != 18) {//시작지점
                        count++;
                        isStart = true;
                        if (j == 9)
                            sb.append("0" + j);
                        else
                            sb.append(j);
                        curStat = false;
                    } else if(!curStat && isReserved && isStart) {//끝나는지점
                        isStart = false;
                        sb.append("-" + j).append("\n");
                        curStat = true;
                    } 
                } else if(isStart && j==18){
                        isStart = false;
                        sb.append("-" + j).append("\n");
                        curStat = true;
                }
            }
            
            if (count == 0) {
                System.out.println("Not available");
            }
            else {
                System.out.println(count + " available:");
                System.out.print(sb);
            }
           
        }
        //true -> false 시작지점
        //false -> true 끝지점
        //11 16 17    --> 09 10 11 //   12 13 14 15 16 //  18  

        //10  14 15    --> 09 10 // 11 12 13 14 // 16 17 18

    }

}