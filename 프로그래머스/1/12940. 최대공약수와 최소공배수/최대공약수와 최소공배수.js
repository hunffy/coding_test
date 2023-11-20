function solution(n, m) {
    var answer = [];
    var r;
    var On = n;
    var Om = m;
    //유클리드 호제법 사용
    //ex m = 108 n=45
    // 1) 108/45 =>   r = 108%45 =18   m = 45  n = 18
    // 2) 45/18 =>  r = 45%18 = 9   m= 18 n = 9
    // 3) 18/9  => r = 18% 9 = 0  m = 9 n =0
    // 4) 9/0   => m =9 n= 0 n이 0이됐으므로 반복문 종료
    while(n!=0){
        r = m%n;
        m = n;
        n = r;
    }
    answer.push(m); //9 입력.
    answer.push(On*Om/answer[0]); // 두수의 곱을 두수의 최대공약수로 나눈 값의 몫. 108*45/9 의 몫 입력.
    
    return answer;
}