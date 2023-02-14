// 내적
// https://programmers.co.kr/learn/courses/30/lessons/70128

function solution(a, b) {
  var answer = 0;

  for (let i = 0; i < a.length; i++) {
    let num = a[i] * b[i];
    answer += num;
  }
  return answer;
}
