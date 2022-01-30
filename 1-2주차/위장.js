// 15분
// 1sol

function solution(clothes) {
    var answer = 0;
    let map = new Map();
    
    for(let i=0; i<clothes.length; i++){
        let clothesType = clothes[i][1];
        if(map.has(clothesType)){
            map.set(clothesType, map.get(clothesType)+1);
        }else{
            map.set(clothesType, 1);
        }
    }
    
    let arr = Array.from(map, ([name, value]) => ({ name, value }));
    
    if(arr.length === 1){
        answer = arr[0].value;
    }else{
        answer = 1;
        for(let i=0; i<arr.length; i++){
            answer *= (arr[i].value+1);
        }
        answer -= 1;
    }
    
    return answer;
}
