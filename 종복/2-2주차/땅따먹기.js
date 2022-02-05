// 15분
// 1sol

function solution(land) {
    var answer = 0;
    let arr = new Array(100010).fill(0);
    for(let i=0; i<arr.length; i++){
        arr[i] = new Array(4).fill(0);
    }
    arr[0][0] = land[0][0];
    arr[0][1] = land[0][1];
    arr[0][2] = land[0][2];
    arr[0][3] = land[0][3];
    let landLen = land.length;

    for(let i=1; i<landLen; i++){
        arr[i][0] = Math.max(arr[i-1][1], arr[i-1][2], arr[i-1][3])+land[i][0];
        arr[i][1] = Math.max(arr[i-1][0], arr[i-1][2], arr[i-1][3])+land[i][1];
        arr[i][2] = Math.max(arr[i-1][0], arr[i-1][1], arr[i-1][3])+land[i][2];
        arr[i][3] = Math.max(arr[i-1][0], arr[i-1][1], arr[i-1][2])+land[i][3];
    }
    answer = Math.max(arr[landLen-1][0], arr[landLen-1][1],arr[landLen-1][2],arr[landLen-1][3]);

    return answer;
}
