function solution(s) {
    var answer = '';
    var arr = s.split(" ");
    for(let i=0; i<arr.length; i++){
        var temp = '';
        for(let j=0; j<arr[i].length; j++){
            if(j%2==0){
                temp+=(arr[i].charAt(j).toUpperCase());
            }else{
                temp+=(arr[i].charAt(j).toLowerCase());
            }
        }
        arr[i] = temp;
    }
    answer = arr.join(" ");
    return answer;
}