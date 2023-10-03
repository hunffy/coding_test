function solution(my_string, is_prefix) {
    var answer = 0;
    //startWith 메서드를 통해 접두사를 확인할 수 있다.
        if(my_string.startsWith(is_prefix)){
            answer = 1;
        }else{
            answer = 0;
        }
    return answer;
}