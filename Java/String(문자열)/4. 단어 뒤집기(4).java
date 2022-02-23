import java.util.*;

public class Main {	
	public ArrayList<String> solution(int n, String[] str){
		ArrayList<String> answer = new ArrayList<>();
      
        for(int i=0; i<str.length; i++){
           char[] s = str[i].toCharArray();
           int lt = 0;
           int rt = str[i].length()-1;
           
           while(lt < rt){
               char tmp = s[lt];
               s[lt] = s[rt];
               s[rt] = tmp;
               lt++;
               rt--;
           }
           String temp = String.valueOf(s);
           answer.add(temp);
           
        }
        return answer;
	}

	public static void main(String[] args){
		Main T = new Main();
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		String[] str=new String[n];
		for(int i=0; i<n; i++){
			str[i]=kb.next();
		}
		for(String x : T.solution(n, str)){
			System.out.println(x);
		}
	}
}

