import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int n = numbers.length;
        
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int num = numbers[i]+numbers[j];
                if(list.indexOf(num) < 0){
                    list.add(num);
                }
            }
        }
        
        int []answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}
