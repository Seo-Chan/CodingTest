// 암호해독
function solution(cipher, code) {
    var answer = ''
    let arr = cipher.split('');
    for (let i = 1; i <= cipher.length; i++) {
        if (i % code === 0) {
            answer += arr[i - 1];
        }
    }
    return answer;
}