import java.util.*;
class Main {	
	public ArrayList<Integer> solution(int n, int k, int[] arr){
		ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
      
        for(int i=0; i<k; i++){
           int key = arr[i];
           if(map.containsKey(key)){
             map.put(key, map.get(key)+1); 
           }else{
             map.put(key, 1);
           }
        }  
      
        answer.add(map.size());
      
        for(int i=k; i<n; i++){
           int key = arr[i];
           int deleteKey = arr[i-k];
           
           if(map.containsKey(key)){
              map.put(key, map.get(key)+1); 
           }else{
              map.put(key, 1); 
           }
          
           map.put(deleteKey, map.get(deleteKey)-1);
              
           if(map.get(deleteKey) == 0){
                map.remove(deleteKey); 
           }
           answer.add(map.size());
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
		for(int x : T.solution(n, k, arr)) System.out.print(x+" ");
	}
}
