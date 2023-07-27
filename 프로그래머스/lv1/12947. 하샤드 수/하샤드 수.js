function solution(x) {
    var answer = true;
    var sum = 0;
    x = String(x);
    
    for(let i=0; i<x.length; i++){
        sum+=parseInt(x.charAt(i));
    }
    if(x%sum!=0){
        answer=false;
    }else {
        answer=true;
    }
    return answer;
}