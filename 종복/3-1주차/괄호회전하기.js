// 20분
// 1sol

function solution(s) {
    var answer = 0;
    
    let origin = s.slice();

    function isRightString(str){

        let stack = [];

        for(let i=0; i<str.length; i++){
            if(str[i] === '(' || str[i] === '[' || str[i] === '{'){
                stack.push(str[i]);
            }else{
                if(stack.length === 0){
                    return false;
                }else{
                    let last = stack[stack.length-1];

                    if(last === '(' && str[i] === ')'){
                        stack.pop();
                    }else if(last === '[' && str[i] === ']'){
                        stack.pop();
                    }else if(last === '{' && str[i] === '}'){
                        stack.pop();
                    }else{
                        return false;
                    }
                }
            }
        }

        if(stack.length === 0){
            return true;
        }else{
            return false;
        }

    }


    while(1){
        

        s = s.substring(1) + s[0];

        if(isRightString(s)){
            answer += 1;
        }

        if(origin === s){
            break;
        }

    }

    
    return answer;
}
