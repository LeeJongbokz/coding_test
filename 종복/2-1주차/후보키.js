function solution(relation) {
    var answer = 0;


    function isUnique(arr){

        for(let i=0; i<arr.length; i++){
            for(let j=i+1; j<arr.length; j++){
                   console.log('arr[i]는?');
                   console.log(arr[i]);
                   console.log('arr[j]는?');
                   console.log(arr[j]);
            }
        }
        return true;
    }
    
    
    function DFS(index, cnt, check, temp, len){

        console.log('index는?');
        console.log(index);
        console.log('cnt는?');
        console.log(cnt);
        console.log(typeof cnt);
        console.log('len은?');
        console.log(len);
        console.log(typeof len);

        if(index+1 === len){

            console.log('여기로 진입');
            console.log('이 때 결과는?');
            console.log(check);

            let temp2 = [];
            for(let i=0; i<relation.length; i++){
                let temp3 = [];
                for(let j=0; j<relation[0].length; j++){
                    if(check[j]){
                        temp3.push(relation[i][j]);
                    }
                }
                temp2.push(temp3);
            }

            console.log('temp2는?');
            console.log(temp2);

            if(isUnique(temp2) && temp2 !== null){
                let str = "";
                for(let i=0; i<len; i++){
                    if(check[i]){
                        str += String(i);
                    }
                }
                
                if(str !== '' && !temp.includes(str)){
                    console.log('이전 temp');
                    console.log(temp);
                    temp.push(str);
                    console.log('이후 temp');
                    console.log(temp);
                }
            }
            return; 
        }else{

            check[index] = true;
            DFS(index+1, cnt+1, check, temp, len);
            check[index] = false;
            DFS(index+1, cnt, check, temp, len);
        }
    }

    let temp = [];
    
    for(let i=1; i<=4; i++){
        let len = i;
        let check = new Array(10).fill(false);

        DFS(0, 0, check, temp, len);
        console.log('temp는?');
        console.log(temp);
    }


    return answer;
}

console.log(solution([["100","ryan","music","2"],["200","apeach","math","2"],["300","tube","computer","3"],["400","con","computer","4"],["500","muzi","music","3"],["600","apeach","music","2"]]));
