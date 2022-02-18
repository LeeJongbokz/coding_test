import java.util.*;
class Main {	
	public int solution(int n, int k){
		int answer=0;
         
        Queue<Integer> queue = new LinkedList<>();
      
        for(int i=1; i<=n; i++){
          queue.add(i);
        }
      
        int cnt = 0; 
      
        while(true){
          
           cnt += 1;
          
           int num = queue.poll();
          
           if(queue.size() == 0){
              answer = num;
              break;
           }
          
           if(cnt != k){
              queue.add(num); 
           }else{
             cnt = 0; 
           } 
        }  
      
		return answer;
	}
	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int k=kb.nextInt();
		System.out.println(T.solution(n, k));
	}
}
