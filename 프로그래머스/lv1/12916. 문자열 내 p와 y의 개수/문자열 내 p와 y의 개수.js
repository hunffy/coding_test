function solution(s){
    var answer = true;
    var pcnt =0;
    var ycnt =0;
    for(let i=0; i<s.length; i++){
        if(s.charAt(i)=='p' || s.charAt(i)=='P'){
            pcnt++;
        }else if(s.charAt(i)=='y' || s.charAt(i)=='Y'){
            ycnt++;
        }
        if(pcnt==ycnt){
            answer = true;
        }else {
            answer = false;
        }
    }

    return answer;
}