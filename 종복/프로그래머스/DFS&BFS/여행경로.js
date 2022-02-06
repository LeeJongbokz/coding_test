function solution(tickets) {
    var answer = [];
    let used = new Array(tickets.length).fill(false);

    function DFS(current, cnt, arr){

        if(cnt === tickets.length){
            let temp = arr.slice();
            answer.push(temp);
            return;
        }

        for(let i=0; i<tickets.length; i++){
            if(current === tickets[i][0] && used[i] === false){
                used[i] = true;
                arr.push(tickets[i][1]);
                DFS(tickets[i][1], cnt+1, arr);
                arr.pop();
                used[i] = false;
            }
        }
    }

    let arr = [];
    arr.push("ICN");

    DFS("ICN", 0, arr);
    answer.sort();
  
    return answer[0];
}
