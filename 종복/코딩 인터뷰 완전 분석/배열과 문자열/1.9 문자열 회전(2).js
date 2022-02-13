function solution(s1, s2) {


    s1 = s1.split("").sort().join("");
    s2 = s2.split("").sort().join("");

    for(let i=0; i<s2.length; i++){
        let word = s2[i];
        if(s1.includes(word)){
            let idx = s1.indexOf(word);
            s1 = s1.substring(0, idx) + s1.substring(idx+1);
        }else{
            return false;
        }
    }
    
    return true;

}

console.log(solution("waterbottle", "erwat"));
