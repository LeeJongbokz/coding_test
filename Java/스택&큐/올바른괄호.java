import java.util.*;

class Main {	
	public String solution(String str){
	  	String answer="YES";
        Stack<Character> stack = new Stack<>();
      
        for(char x: str.toCharArray()){
          if(x == '('){
             stack.push('('); 
          }else{
             if(stack.size() == 0){
                answer = "NO";
                return answer; 
             }
             stack.pop();
          }
        }
          
        if(stack.size() != 0){
           answer = "NO"; 
        }
        
        return answer; 
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str=kb.next();
		System.out.println(T.solution(str));
	}
}
