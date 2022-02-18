import java.util.*;
import java.io.*;

class Main {	
	public int solution(int n, int m, int[] arr){
		int answer=0;
	 	boolean isExist = false;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0; i<arr.length; i++){
            pq.add(arr[i]); 
        }
        
        while(true){
          
          for(int i=0; i<arr.length; i++){
             if(arr[i] == pq.peek()){
                pq.poll(); 
                answer++;
               
                if(m == i){
                   isExist = true;
                   break; 
                } 
             }
          }
          if(isExist == true){
             break; 
          } 
        }
      
        return answer; 
	}

	public static void main(String[] args) throws IOException{
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int m=kb.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
		}
		System.out.println(T.solution(n, m, arr));	
	}
}
