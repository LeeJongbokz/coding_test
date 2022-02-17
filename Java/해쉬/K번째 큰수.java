import java.util.*;

public class Main {	
	public int solution(int[] arr, int n, int k){
		int answer=-1;
        TreeSet<Integer> treeset = new TreeSet<Integer>(Collections.reverseOrder());
         
        for(int i=0; i<n; i++){
          for(int j=i+1; j<n; j++){
            for(int l=j+1; l<n; l++){
               int sum = arr[i]+arr[j]+arr[l];    
               treeset.add(sum);
            }
          }
        }  
      
        int pos = 1;  
      
        for(int num: treeset){
            if(pos == k){
              answer = num;
              break; 
            }
            pos++;
        }
        
        
        return answer; 
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int k=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
		}
		System.out.println(T.solution(arr, n, k));
	}
}
