function solution(s) {
    var answer = true;
    if(s.length==4 || s.length==6){
        for(let i=0; i<s.length; i++){
            if('a'<=s.charAt(i) && s.charAt(i)<='z'){
                answer = false;
                break;
            }else if('A'<=s.charAt(i) && s.charAt(i)<='Z'){
                answer = false;
                break;
            }else {
                answer = true;
            }
        }
    }else{
        answer = false;
    }
    return answer;
}