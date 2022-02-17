class Solution {
    
    String[] arr = ['A', 'E', 'I', 'O', 'U'];
    int cnt = 0; 
    int answer = 0;
        
    public void DFS(String current, int len, String word){
        
        if(current == word){
           answer = cnt;
           return; 
        }
        
        cnt += 1;
        
        for(int i=0; i<arr.length; i++){
            current += arr[i];
            DFS(current, len+1);
            current -= arr[i];
        }
        
        
    }
    
    public int solution(String word) {
        
        int len = 0; 
        String current = "";
        
        DFS(current, 0, word);
         
        
    }
}
