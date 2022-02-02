function solution(cacheSize, cities) {
    var answer = 0;
    
    let queue = [];
     
    if(cacheSize === 0){
        answer = cities.length*5;
        return answer;
    }


    for(let i=0; i<cities.length; i++){

        let city = cities[i].toLowerCase();

        if(queue.length < cacheSize){
            if(queue.includes(city)){
                let idx = queue.indexOf(city);
                queue.splice(idx, 1);
                queue.push(city);
                answer += 1;
            }else{
                queue.push(city);
                answer += 5;
            }
        }else{
            if(queue.includes(city)){
                let idx = queue.indexOf(city);
                queue.splice(idx, 1);
                queue.push(city);
                answer += 1;
            }else{
                queue.shift();
                queue.push(city);
                answer += 5;
            }
        }

    }
            
    return answer;
}
