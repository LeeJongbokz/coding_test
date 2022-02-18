import java.util.*;
class Main {	
	public String solution(int n, int[] arr){
		String answer="U";
		HashSet<Integer> set = new HashSet<>();
      
        for(int i=0; i<n; i++){
          set.add(arr[i]);
        }
        
        if(n != set.size()){
            answer = "D";
        }
      
		return answer;
	}
	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) arr[i]=kb.nextInt();
		System.out.println(T.solution(n, arr));
	}
}
