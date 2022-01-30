// 20분
// 1sol

function solution(s) {

    let answer = [];
    let set = new Set();

    s = s.substring(2, s.length-2);
    let splits = s.split('},{');
    splits.sort(function(a, b)  {
        return a.length - b.length;
    });

    for(let i=0; i<splits.length; i++){
        let numbers = splits[i].split(',');
        for(let j=0; j<numbers.length; j++){
            let num = Number(numbers[j]);
            if(set.has(num)){
                continue;
            }else{
                set.add(num);
                answer.push(num);
            }
        }
    }

    return answer;
}
