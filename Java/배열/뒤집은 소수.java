import java.util.*;
class Main {	
  
    public boolean isPrime(int n){
     
        int cnt = 0; 
        
        for(int i=1; i<=n; i++){
           if(n % i == 0){
              cnt += 1; 
           }
        }
      
        if(cnt == 2){
          return true; 
        }else{
          return false; 
        }
    }

	public ArrayList<Integer> solution(int n, int[] arr){
		ArrayList<Integer> answer = new ArrayList<>();
		
        for(int i=0; i<n; i++){
           String str = Integer.toString(arr[i]);
           String reverseStr = new StringBuilder(str).reverse().toString();
           int num = Integer.parseInt(reverseStr);
           
           if(isPrime(num)) answer.add(num);
          
        }
     
		return answer;
	}
	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
		}
		for(int x : T.solution(n, arr)){
			System.out.print(x+" ");
		}
	}
}
