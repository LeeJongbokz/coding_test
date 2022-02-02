function solution(orders, course) {
    var answer = [];

    for(let i=0; i<course.length; i++){

        let len= course[i];

        for(let j=0; j<orders.length; j++){

            for(let k=j+1; k<orders.length; k++){
                let order1 = orders[j];
                let order2 = orders[k];
                let str = "";

                for(let l=0; l<order1.length; l++){
                    if(order2.includes(order1[l])){
                        str += order1[l];
                    }
                }
                str = str.split("").sort().join("");
                if(!answer.includes(str) && str.length ===len){
                    answer.push(str);
                }
            }
        }

    }

    return answer;
}
