function solution(t, p) {
    var answer = 0;
    var len = p.length;
    //p와 비교할 t에서 p의길이만큼 자른 값을 res배열에 담아준다.
    var res = [];
    
    //2중 for문을 사용하여, res에 p에길이만큼 t를 잘라서 저장해준다.
    for(let i=0; i<=t.length-len; i++){
        res[i]="";
        for(let j=i; j<i+len; j++){
            res[i]+=t.charAt(j);
        }
    }
    
    //마지막으로, res의 각요소들과 p값을 확인하여 작거나 같은수가있다면 1씩증가시켜준다.
    for(let i=0; i<res.length; i++){
        if(parseInt(res[i])<=parseInt(p)){
            answer++;
        }
    }
    return answer;
}