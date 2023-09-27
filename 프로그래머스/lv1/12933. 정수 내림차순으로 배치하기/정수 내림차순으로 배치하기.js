function solution(n) {
    var answer = '';
    var nString = n.toString();
    var bae = [];
    
    for(let i=0; i<nString.length; i++){
        bae[i]=nString[i];
    }
    bae.sort().reverse();
    
    for(let i=0; i<bae.length; i++){
        answer +=bae[i];
    }
    answer = parseInt(answer);
    return answer;
}