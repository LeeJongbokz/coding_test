import java.util.*;
class Main {	
	public char solution(int n, String s){
		char answer=' ';
        HashMap<Character, Integer> map = new HashMap<>();
      
        for(int i=0; i<n; i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
              map.put(c, map.get(c)+1);
            }else{
              map.put(c, 1);
            }
        }
      
        int max = Integer.MIN_VALUE;
        
        for(char key: map.keySet()){
              
              if(map.get(x) > max){
                max = map.get(x);
                answer = key;
              }
        }
      
        return answer;  
      
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		String str=kb.next();
		System.out.println(T.solution(n, str));
	}
}
