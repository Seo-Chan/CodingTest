import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) {
            return cities.length * 5;
        }
        
        int answer = 0;
        List<String> cityList = new ArrayList<>();
        for (String city : cities) {
            city = city.toLowerCase();
            
            if (cityList.contains(city)) {
                cityList.remove(city);
                cityList.add(city);
                
                answer += 1;
            } else {
                if (cityList.size() == cacheSize) {
                    cityList.remove(0);
                }
                
                cityList.add(city);
                
                answer += 5;
            }
        }        
        
        return answer;
    }
}