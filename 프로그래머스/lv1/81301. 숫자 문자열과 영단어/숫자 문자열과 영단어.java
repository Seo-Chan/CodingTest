class Solution {
    public int solution(String s) {
        
    	//영단어를 담는 String 타입의 배열 생성
    	//영단어와 배열의 인덱스값이 동일하다.
        String[] arr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for(int i=0;i<arr.length;i++) {
        	if(s.contains(arr[i])) {
        		s = s.replace(arr[i], Integer.toString(i));
        	}
        }
        return Integer.parseInt(s);
    }
}