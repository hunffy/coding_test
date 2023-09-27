function solution(n) {
    var answer = 0;
    
    //제곱근을 구하는 함수. n이 121이라면 sqrt는 11
    var sqrt = Math.sqrt(n);
    
    //제곱근 중 소수가있을수 있기때문에 위에서 구한 제곱근을 정수로 변환
    var res = Math.floor(sqrt);
    
    //제곱근을 확인하는 구간
    if (res * res == n){
        answer = (res+1)*(res+1);
    //제곱근이 아니라면 -1리턴.
    }else{
        answer = -1;
    }
    return answer;
}