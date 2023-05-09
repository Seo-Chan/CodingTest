function solution(s) {
    let answer = '';
    const max = Math.max(...s.split(' '));
    const min = Math.min(...s.split(' '));
    return min+' '+max;
}