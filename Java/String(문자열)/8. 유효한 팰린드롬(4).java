import java.util.*;
class Main {	
	public String solution(String s){
		String answer="NO";
      	String tmp = s.toLowerCase().replaceAll("[^a-z]", "");
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
