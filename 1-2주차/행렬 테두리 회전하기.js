// 1시간 10분
// 1sol

function solution(rows, columns, queries) {
    var answer = [];
    let num = 1;
    let nextNum = 1;
    let dx = [-1, 0, 1, 0];
    let dy = [0, 1, 0, -1];

    let arr = new Array(rows).fill(0);
    for(let i=0; i<arr.length; i++){
        arr[i] = new Array(columns).fill(0);
    }

    let nextArr = new Array(rows).fill(0);
    for(let i=0; i<nextArr.length; i++){
        nextArr[i] = new Array(columns).fill(0);
    }

    for(let i=0; i<rows; i++){
        for(let j=0; j<columns; j++){
            arr[i][j] = num++;
            nextArr[i][j] = nextNum++;
        }
    }

    function DFS(x, y, direction, minX, minY, maxX, maxY){


        if(x === minX && y === minY && direction === 0){
            return; 
        }

        let nx = x + dx[direction];
        let ny = y + dy[direction];

        if(minX<=nx && nx<=maxX && minY<=ny && ny<=maxY){
            nextArr[nx][ny] = arr[x][y];
            DFS(nx, ny, direction, minX, minY, maxX, maxY);
        }else{
            nx = x - dx[direction];
            ny = y - dy[direction];
            direction += 1;
            direction %= 4;
            nx = x + dx[direction];
            ny = y + dy[direction];
           
            if(minX<=nx && nx<=maxX && minY<=ny && ny<=maxY){
                nextArr[nx][ny] = arr[x][y];
                DFS(nx, ny, direction, minX, minY, maxX, maxY);
            }    
        }
    }

    for(let i=0; i<queries.length; i++){
        let direction = 1;
        let minX = queries[i][0]-1;
        let maxX = queries[i][2]-1;
        let minY = queries[i][1]-1;
        let maxY = queries[i][3]-1;
        let temp = [];

        DFS(minX, minY, direction, minX, minY, maxX, maxY);
         
        for(let i=0; i<rows; i++){
            for(let j=0; j<columns; j++){
                if(arr[i][j] !== nextArr[i][j]){
                    temp.push(arr[i][j]);
                }
            }
        }

        temp.sort(function(a,b){
            return a-b;
        });
        
        answer.push(temp[0]);
     
        for(let i=0; i<rows; i++){
            for(let j=0; j<columns; j++){
                let num = nextArr[i][j];
                arr[i][j] = num;
            }
        }



    }


    return answer;
}
