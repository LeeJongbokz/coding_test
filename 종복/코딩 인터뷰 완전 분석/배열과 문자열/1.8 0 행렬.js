function solution(arr) {

    let arr2 = new Array(arr.length).fill(0);
    for(let i=0; i<arr2.length; i++){
        arr2[i] = new Array(arr.length).fill(0);
    }

    for(let i=0; i<arr.length; i++){
        for(let j=0; j<arr.length; j++){
            arr2[i][j] = arr[i][j];
        }
    }


    function changeToZero(x, y){

        for(let i=0; i<arr.length; i++){
            for(let j=0; j<arr.length; j++){
                if(i === x || j === y){
                    arr2[i][j] = 0;
                }
            }
        }
    }


    for(let i=0; i<arr.length; i++){
        for(let j=0; j<arr.length; j++){
            if(arr[i][j] === 0){
                changeToZero(i, j);
            }
        }
    }

    return arr2;

}

console.log(solution([[1, 1, 1], [1, 1, 1], [0, 1, 1]]));
