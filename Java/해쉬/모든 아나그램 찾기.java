import java.util.*;

class Main {	
	public int solution(String a, String b){
		int answer=0;
        int len = b.length();
      
        char[] StringtoCharB = b.toCharArray();
        Arrays.sort(StringtoCharB);
        String SortedB = new String(StringtoCharB);
           
        for(int i=0; i<a.length()-b.length()+1; i++){
           String temp = a.substring(i, i+b.length()); 
          
           char[] StringtoChar = temp.toCharArray();
           Arrays.sort(StringtoChar);
           String SortedTemp = new String(StringtoChar);
           if(SortedTemp.equals(SortedB)){
             answer += 1; 
           }
        }
      
		return answer;
	}
		

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		String a=kb.next();
		String b=kb.next();
		System.out.print(T.solution(a, b));
	}
}
