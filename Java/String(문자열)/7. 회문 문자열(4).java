import java.util.*;
class Main {	
	public String solution(String str){
		String answer="YES";
        str = str.toLowerCase();
      	int lt = 0;
        int rt = str.length()-1;
      
        while(lt < rt){
          
          if(str.charAt(lt) != str.charAt(rt)){
            answer = "NO";
            break; 
          }
          lt++;
          rt--;
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
