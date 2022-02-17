import java.util.*;

class Main {	
	public String solution(String s1, String s2){
		String answer="YES";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
      
        for(char key: s1.toCharArray()){
            if(map.containsKey(key)){
               map.put(key, map.get(key)+1); 
            }else{
               map.put(key, 1);
            }
        }
      
        for(char key: s2.toCharArray()){
            if(!map.containsKey(key) || map.get(key) == 0){
                answer = "NO";
                return answer;
            }else{
               map.put(key, map.get(key)-1);
            }
        }
       
        return answer; 
      
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String a=kb.next();
		String b=kb.next();
		System.out.print(T.solution(a, b));
	}
}
