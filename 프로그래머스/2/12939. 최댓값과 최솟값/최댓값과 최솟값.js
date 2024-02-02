function solution(s){
    let num = s.split(" ");
    let min = Math.min(...num);
    let max = Math.max(...num);
    
    return min+" "+max;
}