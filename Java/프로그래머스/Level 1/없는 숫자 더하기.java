import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        boolean check[] = new boolean[10];
        Arrays.fill(check,false);
        
        for(int i=0; i<numbers.length; i++){
            int num = numbers[i];
            check[num] = true;
        }
        
        for(int i=0; i<10; i++){
            if(check[i] == false){
                answer += i;
            }
        }
        
        return answer;
    }
     
}
