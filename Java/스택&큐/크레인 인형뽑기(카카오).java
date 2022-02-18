import java.util.*;
class Main {	
	public int solution(int[][] board, int[] moves){
		int answer=0;
		Stack<Integer> stack = new Stack<>();
        int n = board.length;
       
        for(int k=0; k<moves.length; k++){
           int pos = moves[k]-1;
           
           for(int i=0; i<n; i++){
              if(board[i][pos] == 0){
                 continue;
              }else{
                 int num = board[i][pos];
                 if(stack.isEmpty()){
                    stack.push(num); 
                 }else{
                    if(stack.peek() == num){
                       stack.pop();
                       answer += 2;
                    }else{
                      stack.push(num);
                    }
                 }
              board[i][pos] = 0;
              break;
              }
          }
      }          
              
		return answer;
	}
	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int[][] board=new int[n][n];
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				board[i][j]=kb.nextInt();
			}
		}
		int m=kb.nextInt();
		int[] moves=new int[m];
		for(int i=0; i<m; i++) moves[i]=kb.nextInt();
		System.out.println(T.solution(board, moves));
	}
}
