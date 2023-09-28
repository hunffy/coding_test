function solution(n) {
    var answer = 0;
    var n_string = n.toString();
    for(let i=0; i<n_string.length; i++){
        answer += parseInt(n_string[i]);
    }
    return answer;
}