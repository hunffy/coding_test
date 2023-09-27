function solution(numbers) {
    var answer = 0;
    var sum = 1+2+3+4+5+6+7+8+9;
    var res = 0;
    
    for(let i=0; i<numbers.length; i++){
        res += numbers[i];
    }
    answer = sum-res;
    return answer;
}