import java.util.*;
class Main {	
	public int solution(String str){
		int cnt=0;
      
        Stack<Character> stack = new Stack<>(); 
        
        for(int i=0; i<str.length(); i++){
             char c = str.charAt(i);
          
             if(c == '('){
                stack.push(c);
             }else{
                stack.pop();
                if(str.charAt(i-1) == '('){
                  cnt += stack.size(); 
                }else{
                  cnt += 1;
                }
             }
        }
        
		return cnt;
	}
	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str=kb.next();
		System.out.println(T.solution(str));
	}
}
