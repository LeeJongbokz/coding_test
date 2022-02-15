import java.util.*;
  
public class Main {
    public String solution(String str){
		String answer = ""; 
        int maxLen = Integer.MIN_VALUE;   
      
        String[] s = str.split(" ");
      
        for(String x: s){
            if(x.length() > maxLen){
              answer = x;
              maxLen = x.length();
            }
        }
        
        return answer;
    
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str=kb.nextLine();
		System.out.print(T.solution(str));
	}
  
  
}
