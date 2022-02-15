import java.util.*;
class Main {	
	public int solution(String s){
      	s = s.replaceAll("[^0-9]", "");
        return Integer.parseInt(s); 
      
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String str=kb.next();
		System.out.print(T.solution(str));
	}
}
