import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        
        int answer = 0;
        
        Arrays.sort(d);
        
        for(int cost : d) {
            if(budget - cost < 0) return answer;
            answer++;
            budget -= cost;
        }
        
        return answer;
    }
}