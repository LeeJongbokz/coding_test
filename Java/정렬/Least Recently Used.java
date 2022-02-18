import java.util.*;

public class Main {	
	public int[] solution(int size, int n, int[] arr){
		
        ArrayList<Integer> cache = new ArrayList<Integer>();
        int[] answer = new int[size];
        
        for(int i=0; i<n; i++){
          int num = arr[i];
          
          if(cache.contains(num)){
            int idx = cache.indexOf(num);
            cache.remove(idx);
            cache.add(0, num);
          }else{
            
            if(cache.size() == size){
              cache.remove(cache.size()-1);
              cache.add(0, num);
            }else{
              cache.add(0, num);    
            }  
           
          }  
           
        }
        
        for(int i=0; i<size; i++){
            answer[i] = cache.get(i);
        }
        
		return answer;
	}
	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int s=kb.nextInt();
		int n=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) arr[i]=kb.nextInt();
		for(int x : T.solution(s, n, arr)) System.out.print(x+" ");
	}
}
