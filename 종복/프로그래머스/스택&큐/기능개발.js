function solution(progresses, speeds) {
    var answer = [];
    let check = new Array(progresses.length).fill(false);
    let total = 0; 

    while(1){

        if(total === progresses.length){
            break;
        }

        let cnt = 0; 

        for(let i=0; i<progresses.length; i++){
            progresses[i] += speeds[i];
        }

        for(let i=0; i<progresses.length; i++){
            if(progresses[i]>=100){
                if(check[i] === false){
                    check[i] = true;
                    cnt += 1;
                    total += 1;
                } 
            }else{
                break;
            }
        }
        if(cnt !== 0){
            answer.push(cnt);
        }

    }

    return answer;
}
