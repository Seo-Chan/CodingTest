function solution(k, m, score) {
    let answer = 0;
    let idx = 0;
    let arr = score.sort((a,b)=>b-a);
    for(let i=0; i<parseInt(arr.length/m); i++){
        answer += arr[idx+(m-1)];
        idx += m;
    }
    return answer*m;
}