// 배열의 유사도
// https://school.programmers.co.kr/learn/courses/30/lessons/120903

function solution(s1, s2) {
  const i = s1.filter((x) => s2.includes(x));
  return i.length;
}
