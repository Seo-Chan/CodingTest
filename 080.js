// 정수 내림차순으로 배치하기
// https://school.programmers.co.kr/learn/courses/30/lessons/12933

function solution(n) {
  // 문자풀이
  return parseInt((n + "").split("").sort().reverse().join(""));
}
