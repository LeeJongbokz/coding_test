import java.util.*;

public class Main {	
	public String solution(String str){
	    	String answer="";
      	String tmp=""; 
      
        for(int i=0; i<str.length(); i++){
           	if(Character.isAlphabetic(str.charAt(i))){
             	tmp += str.charAt(i);     
            }
        }
        
        tmp = new StringBuilder(tmp).reverse().toString();
        int pos = 0;        
               
        for(int i=0; i<str.length(); i++){
        	if(Character.isAlphabetic(str.charAt(i))){
               answer += tmp.charAt(pos++); 
            }else{
              answer += str.charAt(i);
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
