function solution(arr) {
    var answer = [];
    for(let i=0; i<arr.length; i++){
        if(arr.length==1){
            answer[i]=-1;
        }else{
            let min = Math.min(...arr);
            if(arr[i]===min){
                continue;
            }else{
                answer.push(arr[i]);
            }
        }
    }
    return answer;
}