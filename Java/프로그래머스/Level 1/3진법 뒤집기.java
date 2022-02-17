class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int temp = n;
        String str = "";
        
        while(temp != 0){
            int remain = temp % 3;
            str += Integer.toString(remain);
            temp /= 3;
        }
        
        int pos = 0; 
        
        for(int i=str.length()-1; i>=0; i--){
            answer += Character.getNumericValue(str.charAt(i))*Math.pow(3, pos++);
        }
        
        return answer;
    }
}
