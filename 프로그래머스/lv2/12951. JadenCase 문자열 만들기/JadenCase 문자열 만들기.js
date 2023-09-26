function solution(s) {
    var answer = '';
    var words = s.toLowerCase().split(' ');
    for(let i=0; i<words.length; i++){
        if(words[i] !=''){
            words[i] = words[i][0].toUpperCase() + words[i].slice(1);
        }
    }
    answer = words.join(' ');
    return answer;
}