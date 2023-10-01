function solution(arr1, arr2) {
    var answer = 0;
    var arr1sum = 0;
    var arr2sum = 0;
    if(arr1.length>arr2.length){
        answer = 1;
    }else if (arr1.length<arr2.length){
        answer = -1;
    }else if(arr1.length==arr2.length){
        for(let i=0; i<arr1.length; i++){
            arr1sum +=arr1[i];
            arr2sum +=arr2[i];
        }
        if(arr1sum > arr2sum){
            answer = 1;
        }else if (arr1sum < arr2sum){
            answer = -1;
        }else{
            answer = 0;
        }
    }
    return answer;
}