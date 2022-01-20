// 30분
// 1sol

function solution(s) {
    var answer = 0;
    let minLen = Number.MAX_SAFE_INTEGER;

    for(let i=1; i<=s.length; i++){

        let arr = [];

        let len = i;
        let start = 0;
        let end = start+len;
        
        while(1){
            if(start >= s.length){
                break;
            }
            let str = s.substring(start, end);
            arr.push(str);
            start += len;
            end += len;
        }

        let cnt = 1;
        let resultStr = ""; 
        if(arr.length === 1){
            resultStr += arr[0];
        }

        for(let j=1; j<arr.length; j++){

            if(arr[j-1] === arr[j]){
                cnt += 1;
            }else{
                if(cnt === 1){
                    resultStr += arr[j-1];
                }else{
                    resultStr += String(cnt);
                    resultStr += arr[j-1];
                    cnt = 1;
                }
            }
            if(j === arr.length-1){
                if(cnt === 1){
                    resultStr += arr[j];
                }else{
                    resultStr += String(cnt);
                    resultStr += arr[j];
                }
            }
        }

        if(minLen > resultStr.length){
            minLen = resultStr.length;
        }
    }
    
    return minLen;
}
