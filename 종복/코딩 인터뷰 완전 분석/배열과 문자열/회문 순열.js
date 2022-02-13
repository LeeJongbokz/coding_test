function solution(s) {

    let check = new Array(30).fill(0);
    s = s.toLowerCase();
    let oddCnt = 0; 

    for(let i=0; i<s.length; i++){
        if(s[i] === ' '){
            continue;
        }

        let pos = s.charCodeAt(i)-97;
        check[pos] += 1;
    }

    for(let i=0; i<26; i++){
        if(check[i] % 2 === 1){
            oddCnt += 1;
        }
    }

    if(oddCnt >= 2){
        return false;
    }else{
        return true;
    }
}
