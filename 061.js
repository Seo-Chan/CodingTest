// 약수 구하기
// https://school.programmers.co.kr/learn/courses/30/lessons/120897

function solution(n) {
  return Array(n)
    .fill()
    .map((_, i) => i + 1)
    .filter((v) => n % v === 0);
}
