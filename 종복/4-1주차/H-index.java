import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        int num = 0; 
        
        while(true){
            
            int cnt = 0; 
            
            for(int i=0; i<citations.length;i++){
                if(citations[i] >= num){
                    cnt += 1;
                }
            }
            if(num > cnt){
                break;
            }else{
                num += 1;
            }
            
        }
        
        answer = num-1;
        
        return answer;
    }
}
