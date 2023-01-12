// 양꼬치
// https://school.programmers.co.kr/learn/courses/30/lessons/120830

function solution(n, k) {
  if (n >= 10) {
    k -= ~~(n / 10);
  }
  return n * 12000 + k * 2000;
}
