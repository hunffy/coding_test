function solution(x) {
    var answer = true;
    var nstring = x.toString();
    var sum = 0;
    for(let i=0; i<nstring.length; i++){
        sum += parseInt(nstring[i]);
    }
    if(x%sum==0){
        answer;
    }else{
        answer = false;
    }
    return answer;
}