function solution(arr) {
    var answer = [];
    var min = Math.min(...arr);
    answer = arr.filter(num => num!==min);
    
    if(answer.length===0){
        return [-1];
    }
    return answer;
}