function solution(s){
    var answer = true;
    var cnt_y = 0;
    var cnt_p = 0;
    for(let i=0; i<s.length; i++){
        if(s[i]=='y' || s[i]=='Y'){
            cnt_y++;
        }else if(s[i]=='p' || s[i]=='P'){
            cnt_p++;
        }
    }
    if(cnt_y!=cnt_p){
        answer = false;
    }else{
        answer;
    }

    return answer;
}