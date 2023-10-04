function solution(arr, idx) {
    var answer = 0;
    for(let i=idx; i<arr.length; i++){
        if(arr[idx]==0){
            if(arr[i]==1){
                answer = i;
                break;
            }else{
                answer = -1;
            }
        }else if(arr[idx]==1){
            answer = idx;
        }
    }
    return answer;
}