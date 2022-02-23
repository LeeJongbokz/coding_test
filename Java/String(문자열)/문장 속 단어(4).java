import java.util.*;
class Main {	
	public String solution(String str){
		    String answer="";
        int maxlen = Integer.MIN_VALUE;
        int pos = 0;
      
        while( (pos = str.indexOf(' ')) != -1){
            String tmp = str.substring(0, pos);
            if(maxlen < tmp.length()){
              maxlen = tmp.length();
              answer = tmp;
            }
            str = str.substring(pos+1);
        }
      
        if(maxlen < str.length()){
           maxlen = str.length();
           answer = str;
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
