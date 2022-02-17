import java.util.Arrays;

class Solution {
    
    int maxCnt = 0;
    public boolean check[];
  
    
    public void DFS(int k, int[][] dungeons, int cnt){
        
        
        for(int i=0; i<dungeons.length; i++){
            if(check[i] == false && k>=dungeons[i][0]){
                check[i] = true;
                k -= dungeons[i][1];
                DFS(k, dungeons, cnt+1);
                k += dungeons[i][1];
                check[i] = false;
            }      
        }
        
        maxCnt = Math.max(maxCnt, cnt);
        
    }
    
    
    public int solution(int k, int[][] dungeons) {
        
        check = new boolean[dungeons.length];
        
        int answer = -1;
        
        int cnt = 0; 
        
        
        DFS(k, dungeons, cnt);
        
        answer = maxCnt;
        
        return answer;
    }
}
