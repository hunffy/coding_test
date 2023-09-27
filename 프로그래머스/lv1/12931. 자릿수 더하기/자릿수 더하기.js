function solution(n)
{
    var answer = 0;
    //자연수 n을 문자열로 변환 num = "123"
    var num = n.toString();
    //반복문을 통해 쪼갠 후 parseInt 정수형으로 바꿔서 더한값을 저장해준다.
    for(let i=0; i<num.length; i++){
        answer += parseInt(num[i]);
    }
    return answer;
}