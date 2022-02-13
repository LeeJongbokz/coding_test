function solution(s) {

    s = s.replace(/ /g, '%20');

    return s;
}

console.log(solution("Mr John Smith"));
