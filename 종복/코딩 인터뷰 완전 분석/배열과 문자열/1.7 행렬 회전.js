function solution(arr) {

    let arr2 = new Array(arr.length).fill(0);
    for(let i=0; i<arr2.length; i++){
        arr2[i] = new Array(arr.length).fill(0);
    }

    console.log(arr2);
    
    for(let i=0; i<arr.length; i++){

        for(let j=0; j<arr[0].length; j++){
            arr2[j][(arr.length-1)-i] = arr[i][j];
        }
    }

    console.log(arr2);

}

console.log(solution([[1, 1, 1], [1, 0, 0], [0, 1, 1]]));
