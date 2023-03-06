// 내적
// https://school.programmers.co.kr/learn/courses/30/lessons/70128

function solution(a, b) {
  var answer = a.reduce((acc, cur, idx) => (acc += cur * b[idx]), 0);
  return answer;
}
