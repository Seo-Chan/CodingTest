import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int [] student = new int [n+1];
        for(int i=1; i<=n; i++){
            student[i] = 1;
        }
        for(int i=0; i<lost.length; i++){
            student[lost[i]]--;
        }
        for(int i=0; i<reserve.length; i++){
            student[reserve[i]]++;
        }
        for(int i=1; i<=n; i++){
            if(student[i]==0&&student[i-1]==2){
                student[i]++;
                student[i-1]--;
            }else if(student[i]==0&&i+1!=n+1&&student[i+1]==2){
                student[i]++;
                student[i+1]--;
            }
        }
        for(int i=1; i<=n; i++){
            if(student[i]==1 || student[i]==2)
            answer ++;
        }
        return answer;
    }
}