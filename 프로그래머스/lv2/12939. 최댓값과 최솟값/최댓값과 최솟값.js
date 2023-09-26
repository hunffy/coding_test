function solution(s) {
    var answer = '';
    var numbers = s.split(" ").map(Number);
    var min = Math.min(...numbers);
    var max = Math.max(...numbers);
    
    answer = min + ' ' + max ;
    return answer;
}