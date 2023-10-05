function solution(n) {
    //...n.toString([N진수]) : 숫자를 입력한 진수로 변환한 string으로 반환한다.
    // 3진법으로 변환된값 예를들어 n이 45라면 45의 3진법값 1200이 [1,2,0,0]형태가된다.
    // [1,2,0,0]을 문제대로 reverse를 통해 역순으로 바꿔주고
    //join으로 다시 "0021" 형태의 문자열로 만든다.
    //마지막으로 parseInt를 통해 정수로바꿔주고, 10진법으로 변환하여 출력해준다.
    return parseInt([...n.toString(3)].reverse().join(""), 3);
}