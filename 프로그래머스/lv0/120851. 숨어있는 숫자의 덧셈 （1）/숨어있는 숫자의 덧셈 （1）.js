function solution(my_string) {
    var answer = 0;
    for(let i=0; i<my_string.length; i++){
        if('1'<=my_string.charAt(i) && my_string.charAt(i)<='9'){
            answer += parseInt(my_string.charAt(i));
        }
    }
    return answer;
}