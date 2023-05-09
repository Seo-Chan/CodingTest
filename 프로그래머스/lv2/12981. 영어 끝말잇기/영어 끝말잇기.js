function solution(n, words) {
    var answer = [0,0];
    let map = new Map();
    map.set(words[0],1);
        for(let i=1; i<words.length; i++){
            let last = words[i-1].length - 1;
            if(map.get(words[i])!==undefined){
                answer[0] = i%n + 1;
                answer[1] = Math.ceil((i+1)/n);
                break;
            } else if(words[i][0]!==words[i-1][last]){
                answer[0] = i%n + 1;
                answer[1] = Math.ceil((i+1)/n);
                break;
            } else {
                map.set(words[i],1);
            }
        }
    return answer;
}