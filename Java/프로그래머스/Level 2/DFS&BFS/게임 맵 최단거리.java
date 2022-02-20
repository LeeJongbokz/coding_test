import java.util.*;

class Point {
    int x;
    int y;
    int dist;
    
    public Point(int x, int y, int dist){
        this.x = x;
        this.y = y; 
        this.dist = dist;
    }
}

class Solution {
    
    static boolean[][]visited;
    static int rowLen;
    static int colLen;
    int[] dx = {0, 0, -1, 1};
    int[] dy = {1, -1, 0, 0};
    
    public boolean isInside(int x, int y){
        if(0<=x && x<rowLen && 0<=y && y<colLen){
            return true;
        }else{
            return false; 
        }
    }
    
    public int bfs(int x, int y, int targetX, int targetY, int[][] maps){
        
        Queue<Point> queue = new LinkedList<Point>();
        queue.offer(new Point(0, 0, 1));
        visited[x][y] = true;
        
        while(!queue.isEmpty()){
            Point p = queue.poll();
            int cx = p.x;
            int cy = p.y;
            int cDist = p.dist;
            if(cx == targetX-1 && cy == targetY-1) return cDist;
            
            for(int i=0; i<4; i++){
                int nx = cx+dx[i];
                int ny = cy+dy[i];
                if(isInside(nx, ny) && visited[nx][ny] == false && maps[nx][ny] == 1){
                    visited[nx][ny] = true;
                    queue.offer(new Point(nx, ny, cDist+1));
                }
            }    
            
        }
        
        return -1;
        
    }
    
    
    public int solution(int[][] maps) {
        int answer = -1;
        
        rowLen = maps.length;
        colLen = maps[0].length; 
        
        visited = new boolean[rowLen][colLen];
        
        answer = bfs(0, 0, rowLen, colLen, maps);
        
        return answer;
    }
}
