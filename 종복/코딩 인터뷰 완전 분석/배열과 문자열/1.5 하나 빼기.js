function solution(s1, s2) {

    s1 = s1.toLowerCase();
    s2 = s2.toLowerCase();
    let diffCnt = 0; 

    if(s1.length === s2.length){

        for(let i=0; i<s1.length; i++){
            if(s1[i] !== s2[i]){
                diffCnt += 1;
            }
        }
        if(diffCnt === 1){
            return true;
        }else{
            return false; 
        }

    }else if(s1.length +1 === s2.length){

        for(let i=0; i<s2.length; i++){
            if(s1[i] !== s2[i]){
                s2 = s2.substring(0, i) + s2.substring(i+1);
                break;
            }
        }

        if(s1 === s2){
            return true;
        }else{
            return false;
        }

    }else if(s1.length -1 === s2.length){

        for(let i=0; i<s1.length; i++){
            if(s1[i] !== s2[i]){
                s1 = s1.substring(0, i) + s1.substring(i+1);
                break;
            }
        }

        if(s1 === s2){
            return true;
        }else{
            return false;
        }

    }else{

        return false;
    }    
   

}

console.log(solution("pale", "bake"));
