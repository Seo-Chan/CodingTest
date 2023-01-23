// 머쓱이보다 키큰사람
// https://school.programmers.co.kr/learn/courses/30/lessons/120585

function solution(array, height) {
  return array.filter((v) => v > height).length;
}
