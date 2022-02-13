function solution(s) {
  
    s = s.toLowerCase();
    let check = new Array(30).fill(0);

    for(let i=0; i<s.length; i++){
        let pos = s.charCodeAt(i)-97;
        check[pos] += 1;
    }


    for(let i=0; i<s.length; i++){
        if(check[i] >= 2){
            return false;
        }
    }

    return true;

}

console.log(solution("aba"));
