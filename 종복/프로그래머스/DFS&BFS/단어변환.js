function solution(begin, target, words) {
    var answer = 0;
    let minCnt = 10000000;
    let visited = new Array(words.length).fill(false);

    function isCompare(str1, str2){

        let isDiff = 0; 

        for(let i=0; i<str1.length; i++){
            if(str1[i] !== str2[i]){
                isDiff += 1;
            }
        }

        if(isDiff === 1){
            return true;
        }else{
            return false; 
        }

    }


    function DFS(current, cnt){

        if(current === target){
            if(minCnt > cnt){
                minCnt = cnt;
            }            
            return; 
        }else{

            for(let i=0; i<words.length; i++){
                if(visited[i] === false && isCompare(current, words[i])){
                    visited[i] = true;
                    DFS(words[i], cnt+1);
                    visited[i] = false;
                }
            }
        }       

    }


    DFS(begin, 0);

    if(minCnt === 10000000){
        answer = 0;
    }else{
        answer = minCnt;
    }


    return answer;
}
