function solution(s) {

    let cnt = 1; 
    let str = s[0];

    for(let i=1; i<s.length; i++){
        if(s[i-1] === s[i]){
            cnt += 1;    
        }else{
            str += String(cnt);
            str += s[i];
            cnt = 1;
        }
    }

    str += String(cnt);

    if(s.length < str.length){
        return s;
    }else{
        return str;
    }
   

}

console.log(solution("abcde"));
