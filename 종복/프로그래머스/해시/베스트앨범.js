// 30분
// 2sol

function solution(genres, plays) {
    var answer = [];
    
    let map = new Map();
    
    
    for(let i=0; i<genres.length; i++){
        if(map.has(genres[i])){
            map.set(genres[i], map.get(genres[i])+plays[i]);
        }else{
            map.set(genres[i], plays[i]);
        }
    }

    const mapSort1 = new Map([...map.entries()].sort((a, b) => b[1] - a[1]));
    for(let [key, val] of mapSort1){
        
        let map = new Map();
        for(let i=0; i<genres.length; i++){
            if(genres[i] === key){
                map.set(i, plays[i]);
            }
        }

        const mapSort2 = new Map([...map.entries()].sort((a, b) => b[1] - a[1]));
    
        let cnt = 0; 
        for(let [key, val] of mapSort2){

            if(cnt === 2){
                break;
            }
            answer.push(key);
            cnt += 1;
        }
    }
    
    return answer;
}
