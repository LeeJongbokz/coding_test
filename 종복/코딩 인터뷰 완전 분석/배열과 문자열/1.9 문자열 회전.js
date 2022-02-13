function solution(s1, s2) {


    s1 = s1.split("").sort().join("");
    s2 = s2.split("").sort().join("");

    if(s1 === s2){
        return true;
    }else{
        return false;
    }

}

console.log(solution("waterbottle", "frbottlewat"));
