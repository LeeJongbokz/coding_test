import java.util.*;
class Main {	
	public String solution(String str){
		String answer="";
        String[] words = str.split(" ");
        int maxLen = Integer.MIN_VALUE;
      
        for(String word: words){
          if(maxLen < word.length()){
             maxLen = word.length();
             answer = word;
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
