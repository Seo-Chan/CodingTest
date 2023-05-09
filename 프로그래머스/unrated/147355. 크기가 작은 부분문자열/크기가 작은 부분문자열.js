function solution(t, p) {
    let answer = 0;
    const numberP = Number(p);
    for(let i=0; i<t.length-p.length+1; i++){
        let slicedT = t.slice(i,p.length+i);
        let numberT = Number(slicedT);
        if(numberT<=numberP) {
            answer++;
        }
    }
    return answer;
}