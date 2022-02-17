import java.util.*;
class Main {	
	int[] dx={-1, 0, 1, 0};
	int[] dy={0, 1, 0, -1};
	public int solution(int n, int[][] arr){
		    
        int answer=0;
        
        for(int i=0; i<n; i++){
          for(int j=0; j<n; j++){
            
            boolean check = true;
         
            for(int k=0; k<4; k++){
             
              int ni = i+dx[k];
              int nj = j+dy[k];
              
              if(0<=ni && ni<n && 0<=nj && nj<n){
                  if(arr[ni][nj]>=arr[i][j]){
                    check = false;
                  }
              }
            }
            
            if(check == true){
               answer += 1; 
            }
          }
        }
       
		return answer;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int[][] arr=new int[n][n];
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				arr[i][j]=kb.nextInt();
			}
		}
		System.out.print(T.solution(n, arr));
	}
}
