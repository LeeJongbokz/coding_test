function solution(s1, s2) {
  
    s1 = s1.toLowerCase();
    s2 = s2.toLowerCase();
   
    let check1 = new Array(30).fill(0);
    let check2 = new Array(30).fill(0);

    for(let i=0; i<s1.length; i++){
        let pos = s1.charCodeAt(i)-97;
        check1[pos] += 1;
    }

    for(let i=0; i<s2.length; i++){
        let pos = s2.charCodeAt(i)-97;
        check2[pos] += 1;
    }

    for(let i=0; i<26; i++){
        if(check1[i] !== check2[i]){
            return false;
        }
    }

    return true;


}

console.log(solution("abe", "bae"));
