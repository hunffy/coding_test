function solution(s) {
    var answer = [];
    var index = [];
    
    for(let i=0; i<s.length; i++){ //s = "banana"
 // 1. i=0 char = 'b'
 // 2. i=1 char = 'a'
// 3. i= 2 char = 'n'
// 4. i=3 char ='a'
        let char = s[i]; 
        
// 1.index[b] === undefinded
// 2. index[a] ===undefinded
// 3. index[n] ===undefinded
        if(index[char]===undefined){  
            answer.push(-1);          
        }else{
//4. i=3 char = 'a' index[char] = index[a] 처음 index[a]의 인덱스가 저장된 1
            //결국 i- index[char] => 3-1 = 2를 answer배열에 저장.
            answer.push(i-index[char])
        }
        // 1.index[b] = 0;
        // 2.index[a] = 1;
        // 3.index[n] = 2;
        index[char] = i;  
    }
    return answer;
}