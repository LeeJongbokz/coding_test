function solution(n) {
    var answer = [];

    let arr = new Array(n).fill(0);
    for(let i=0; i<arr.length; i++){
        arr[i] = new Array(i+1).fill(0);
    }

    let dx = [1, 0, -1];
    let dy = [0, 1, -1]
    let direction = 0;

    let num = 1;
    let x = 0;
    let y = 0;
    let move = n;
    let minus = 0; 

    while(1){

        if(minus === n){
            break;
        }

        while(move--){
            arr[x][y] = num++;
            if(move !==0){
                x += dx[direction];
                y += dy[direction];
            }else{
                direction += 1;
                direction %= 3;
                x += dx[direction];
                y += dy[direction];
            }
            
        }
        minus += 1;
        move = n - minus;
    }


    for(let i=0; i<n; i++){
        for(let j=0; j<=i; j++){
            answer.push(arr[i][j]);
        }
    }


    return answer;
}
