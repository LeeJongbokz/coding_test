import java.util.*;

class Solution {
    
    boolean[] visited = new boolean[210];
    
    public void DFS(int current, int n, int[][] computers){
        
        for(int j=0; j<n; j++){
            if(current !=j && computers[current][j] == 1 && visited[j] == false){
                visited[j] = true;
                DFS(j, n, computers);
            }
        }
        
    }
    
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        
        for(int i=0; i<n; i++){
            if(visited[i] == false){
               visited[i] = true;
               DFS(i, n, computers);
               answer += 1;   
            }
        }
        
        return answer;
    }
}
