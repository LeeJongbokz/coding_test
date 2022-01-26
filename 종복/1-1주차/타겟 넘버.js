// 1sol
// 5분

function solution(numbers, target) {
    var answer = 0;
    let n = numbers.length;
    
    function DFS(index, sum){
        
        if(index === n){
            if(sum === target){
                answer += 1;
            }
        }else{
           DFS(index+1, sum+numbers[index]);
           DFS(index+1, sum-numbers[index]);
        }
        
    }
    
    DFS(0, 0);
    
    return answer;
}
