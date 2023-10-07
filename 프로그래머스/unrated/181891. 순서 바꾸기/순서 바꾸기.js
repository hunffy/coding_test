function solution(num_list, n) {
    var answer = [];
    var first = [];
    var second = [];
    
    for(let i=0; i<n; i++){
        first.push(num_list[i]);
    }
    
    for(let j=n; j<=num_list.length-1; j++){
        second.push(num_list[j]);
    }
    
    answer = second.concat(first);
    
    return answer;
}