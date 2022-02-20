import java.util.*;

class Solution {
    
    static boolean []visited;
    
    public void bfs(int current, int n, int[][] computers){
        Queue<Integer> queue = new LinkedList();
        queue.offer(current);
        visited[current] = true;
        
        while(!queue.isEmpty()){
            int x = queue.poll();
            for(int i=0; i<n; i++){
                if( (x != i) && computers[x][i] == 1 && visited[i] == false){
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
        
    }
    
    
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n+1];
        
        for(int i=0; i<n; i++){
            if(visited[i] == false){
              answer += 1;
              bfs(i, n, computers);   
            }
        }
        
        return answer;
    }
}
