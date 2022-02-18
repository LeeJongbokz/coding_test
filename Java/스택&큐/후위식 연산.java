import java.util.*;
class Main {	
	public int solution(String str){
		int answer=0;
	    Stack<Integer> stack = new Stack<>();
      
        for(char c: str.toCharArray()){
           if(c == '+'){
             int num1 = stack.peek();
             stack.pop();
             int num2 = stack.peek();
             stack.pop();
             int num = num1 + num2;
             stack.push(num);
             
           }else if(c == '-'){
             int num1 = stack.peek();
             stack.pop();
             int num2 = stack.peek();
             stack.pop();
             int num = num2 - num1;
             stack.push(num);
             
           }else if(c == '*'){
             int num1 = stack.peek();
             stack.pop();
             int num2 = stack.peek();
             stack.pop();
             int num = num1 * num2;
             stack.push(num);
             
           }else if(c == '/'){
             int num1 = stack.peek();
             stack.pop();
             int num2 = stack.peek();
             stack.pop();
             int num = num2 / num1;
             stack.push(num);
           }else{
             int num = Character.getNumericValue(c);
             stack.push(num);
           }
           
        }
        
        answer = stack.peek();
      
      
		return answer;
	}
	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str=kb.next();
		System.out.println(T.solution(str));
	}
}
