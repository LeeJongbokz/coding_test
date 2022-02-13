function solution(s) {
  
    s = s.toLowerCase();
    s = s.split("").sort().join("");

    for(let i=0; i<s.length-1; i++){
        if(s[i] === s[i+1]){
            return false;
        }
    }

    return true;

}

console.log(solution("abe"));
