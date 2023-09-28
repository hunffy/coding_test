function solution(n) {
    var answer = 0;
    var pizza = 7;
    if(n%pizza==0){
        answer = n/pizza;
    }else{
        answer = Math.floor(n/pizza)+1;
    }
    return answer;
}