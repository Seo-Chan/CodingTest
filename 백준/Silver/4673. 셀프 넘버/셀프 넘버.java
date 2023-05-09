public class Main {
    public static void main(String args[]){
        boolean[] sumArr = new boolean [10001];
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=10000; i++){
            int sum = 0;
            for(int j=0; j<Integer.toString(i).length(); j++){
                String num = Integer.toString(i);
                int n = num.charAt(j)-'0';
                sum += n;
            }
            sum += i;
            if(sum<=10000) {
                sumArr[sum] = true;
            }
        }
        for(int i=0; i<sumArr.length;i++){
            if(sumArr[i]==false&&i!=0){
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }
}
