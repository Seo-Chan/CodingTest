// 가운데 글자 가져오기
// https://school.programmers.co.kr/learn/courses/30/lessons/12903

function solution(s) {
  const mid = Math.floor(s.length / 2);
  return s.length % 2 === 1 ? s[mid] : s[mid - 1] + s[mid];
}
