import java.util.*;
class Main {	
	public String solution(String str){
		String answer="";
        Stack<Character> stack = new Stack<Character>();
      
        for(char c: str.toCharArray()){
            if(c == '('){
              stack.push('('); 
            }else if(c == ')'){
              stack.pop(); 
            }else{
              if(stack.size() == 0){
                answer += Character.toString(c); 
              }
            }         
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
