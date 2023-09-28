function solution(numbers) {
    var answer = 0;
    numbers = numbers.sort((a,b)=>a-b).reverse();
    answer = numbers[0]*numbers[1];
    return answer;
}