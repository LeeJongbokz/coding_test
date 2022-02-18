import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<participant.length; i++){
            String tmp = participant[i];
            if(map.containsKey(tmp)){
                map.put(tmp, map.get(tmp)+1);
            }else{
                map.put(tmp, 1);
            }
        }
        
        for(int i=0; i<completion.length; i++){
            String tmp = completion[i];
            if(map.containsKey(tmp)){
                map.put(tmp, map.get(tmp)-1);
                if(map.get(tmp) == 0){
                    map.remove(tmp);
                }
            }
        }
        
        for(String str: map.keySet()){
            answer = str;
        }
    
        return answer;
    }
}
