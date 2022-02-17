class Solution {
    public int solution(String s) {
        int answer = 0;
        
        if(s.charAt(0) != '-'){
            answer = Integer.parseInt(s);
        }else{
            s = s.substring(1);
            answer = (-1)*Integer.parseInt(s);
        }
    
        return answer;
    }
}
