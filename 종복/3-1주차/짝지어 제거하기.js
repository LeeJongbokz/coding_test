// 30분
// 참고

function solution(s)
{
    let answer = 0; 
    let arr = [];
    
    for(let i=0; i<s.length; i++){
        arr.push(s[i]);
        if(arr[arr.length-1] === arr[arr.length-2]){
            arr.pop();
            arr.pop();
        }
    }
    
    if(arr.length === 0){
        answer = 1;
    }else{
        answer = 0;
    }

    return answer;
}
