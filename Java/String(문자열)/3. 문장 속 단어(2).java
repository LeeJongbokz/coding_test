import java.util.*;

class Main {
    public String solution(String str){
        String answer="";
        int maxLen = Integer.MIN_VALUE;
        String[] arr = str.split(" ");

        for(int i=0; i<arr.length; i++){
            int len = arr[i].length();
            if(maxLen < len){
                answer = arr[i];
                maxLen = len;
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


