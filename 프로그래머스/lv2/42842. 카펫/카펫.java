class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int width = 0;
        int height = 0;
        for(int i=1; i<=brown/2; i++){
            for(int j=1; j<=i; j++){
                if(2*(i+j)-4==brown && (i-2)*(j-2)==yellow){
                   answer[0] = i;
                    answer[1] = j;
                }
            }
        }
        return answer;
    }
}