class Solution {
    
    static int answer = 0; 
    
    public void DFS(int sum, int pos, int[] numbers, int target){
        
        if(pos == numbers.length){
            if(sum == target){
                answer += 1;
            }
            return; 
        }else{
            DFS(sum+numbers[pos], pos+1, numbers, target);
            DFS(sum-numbers[pos], pos+1, numbers, target);
        }   
        
    }
    
    
    public int solution(int[] numbers, int target) {
       
        answer = 0; 
        
        DFS(0, 0, numbers, target);
     
        return answer;
    }
}
