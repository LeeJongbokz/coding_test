import java.util.*;

public class Main {	
	public String solution(String str){
		String answer="YES";
        str = str.toLowerCase();
        String reverseStr = new StringBuilder(str).reverse().toString();
      
        if(!str.equals(reverseStr)){
           answer = "NO";
        }
        
      
        return answer; 
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str=kb.next();
		System.out.print(T.solution(str));
	}
}
