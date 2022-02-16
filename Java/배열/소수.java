import java.util.*;
class Main {	
  
    public boolean isPrime(int n){
        
       int cnt = 0; 
      
       for(int i=2; i<=Math.sqrt(n); i++){
             if(n % i == 0){
                cnt += 1;
             }
       }
      
       if(cnt == 0){
          return true; 
       }else{
         return false;
       }
    }
  
  
	public int solution(int n){
		     int cnt=0;
        for(int i=2; i<=n; i++){
            if(isPrime(i)) cnt += 1;

        }
      
		return cnt;
	}
	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		System.out.println(T.solution(n));
	}
}
