// 문자열 다루기 기본
// https://school.programmers.co.kr/learn/courses/30/lessons/12918

function solution(s) {
  const regex = /^\d+$/g;
  if ((s.length === 4 || s.length === 6) && regex.test(s)) {
    return true;
  } else return false;
}
