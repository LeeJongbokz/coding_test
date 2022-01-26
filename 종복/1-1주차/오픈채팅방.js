// 41분
// 1sol

function solution(record) {

    var answer = [];

    let map = new Map();

    let arr = new Array(1000010); 
        
    for(let i=0; i<1000010; i++){
        arr[i] = new Array(3);
    }

    let pos = 0; 
    
    for(let i=0; i<record.length; i++){
        
        let splits = record[i].split(" ");
        if(splits[0] === 'Enter'){
            let id = splits[1];
            let name = splits[2];

            if(map.has(id)){
                map.set(id, name);
            }else{  
                map.set(id, name);
            }

            arr[pos][0] = id;
            arr[pos][1] = name;
            arr[pos][2] = "님이 들어왔습니다.";
            pos += 1;

        }else if(splits[0] === 'Leave'){

            let id = splits[1];

            let name = map.get(id);
            
            arr[pos][0] = id;
            arr[pos][1] = name;
            arr[pos][2] = "님이 나갔습니다.";
            pos += 1;

        }else if(splits[0] === 'Change'){
            let id = splits[1];
            let name = splits[2];
            map.set(id,name);
        }
    }
    
    for(let i=0; i<pos; i++){
        let id = arr[i][0];
        let searchedName = map.get(id);
        arr[i][1] = searchedName;
    } 
    
    for(let i=0; i<pos; i++){
        let str = arr[i][1]+arr[i][2];
        answer.push(str);
    }

    return answer;
}
