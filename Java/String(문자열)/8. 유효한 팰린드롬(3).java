import java.util.*;
class Main {	
	public String solution(String s){
		
        String answer="NO"; 
        String tmp = "";
    
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(Character.isAlphabetic(c)){
                tmp += Character.toString(c);
            }
        }
        tmp = tmp.toLowerCase();
        
        String reverseTmp = new StringBuilder(tmp).reverse().toString();
        
        if(tmp.equals(reverseTmp)){
           answer = "YES"; 
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
