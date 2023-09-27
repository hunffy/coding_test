function solution(n) {
    var answer = [];
    var numstring = n.toString();
    for(let i=0; i<numstring.length; i++){
        answer[i]=parseInt(numstring[numstring.length-(i+1)]);
    }
    return answer;
}