function solution(a, b, n) {
    var answer = 0;
    let getCola = 0;
    let nowCola = 0;
    for(;;){
        getCola = (Math.floor(n/a)*b);
        nowCola = getCola + n%a
        n = nowCola
        answer += getCola
        if(nowCola<a) break;
    }
    return answer;
}