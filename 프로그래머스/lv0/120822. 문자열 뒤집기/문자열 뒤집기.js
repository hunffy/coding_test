function solution(my_string) {
    var answer = '';
    var arr = [];
    for(let i=0; i<my_string.length; i++){
        arr[i] = my_string.charAt(i);
    }
    arr = arr.reverse();
    answer = arr.join("");
    return answer;
}