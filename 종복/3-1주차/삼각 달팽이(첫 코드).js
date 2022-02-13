function solution(n) {
    var answer = [];

    let arr = new Array(n).fill(0);
    for(let i=0; i<arr.length; i++){
        arr[i] = new Array(i+1).fill(0);
    }

    let visited = new Array(n).fill(0);
    for(let i=0; i<arr.length; i++){
        visited[i] = new Array(i+1).fill(0);
    }

    let target = (n*(n+1))/2;

    let dx = [1, 0, -1];
    let dy = [0, 1, -1]
    let direction = 0;

    function isInside(x, y){

        if(0<=x && x<=n-1 && 0<=y && y<=n-1){
            return true;
        }else{
            return false;
        }
    }

    function DFS(x, y, num){

        if(num === target+1){
            return;
        }

        let nx = x + dx[direction];
        let ny = y + dy[direction];

        if(!isInside(nx, ny) || visited[nx][ny] === true){
            nx = x - dx[direction];
            ny = y - dy[direction];
            direction += 1;
            direction %= 3;
            nx = x + dx[direction];
            ny = y + dy[direction];
           
        }

        arr[nx][ny] = num; 
        visited[nx][ny] = true;
        DFS(nx, ny, num+1);


    }

    arr[0][0] = 1;
    visited[0][0] = true;
    DFS(0, 0, 2);

    console.log('arr은?');
    console.log(arr);

    for(let i=0; i<n; i++){
        for(let j=0; j<=i; j++){
            answer.push(arr[i][j]);
        }
    }


    return answer;
}

console.log(solution(20));
