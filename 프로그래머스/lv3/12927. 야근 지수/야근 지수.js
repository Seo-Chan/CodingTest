function solution(n, works) {
    // 할 수 있는 일의 총량이 works 배열을 모두 비울 수 있는 경우
    if(works.reduce((a,b) => a+b,0) <= n) return 0
    
    // 오름차순 정렬
    works.sort((a,b) => b-a)
    
    // 아직 할 수 있는 일이 남은경우
    while(n) {
        // 0번째 인덱스가 해당 반복의 최댓값
        const max = works[0]
        for(let i = 0 ; i < works.length ; i ++) {
            // 해당 인덱스도 최댓값과 같다면
            if(works[i] === max) {
                n--
                works[i]--
            }
            if(!n) break
        }    
    }
    
    return works.reduce((a,b) => a+(b**2) ,0)
}