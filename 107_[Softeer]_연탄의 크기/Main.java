import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[] houses = new int[N];

        int maxR = 0;
        
		for(int i=0; i<N; i++){
		  houses[i] = Integer.parseInt(st.nextToken());
          if(maxR < houses[i]){
              maxR = houses[i];
          }
		};

        int maxCount =0;
        for(int i=2; i<=maxR; i++){
            int useCnt = 0;
            for(int j=0; j<N; j++){
                if(houses[j]%i ==0 ) useCnt++;
            }
            if(maxCount < useCnt ){
                maxCount = useCnt;
            }
           
        }

        System.out.println(maxCount);
       
       
    }
}