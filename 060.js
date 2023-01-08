// 특정 문자 제거하기
// https://school.programmers.co.kr/learn/courses/30/lessons/120826

function solution(my_string, letter) {
  const answer = my_string.split(letter).join("");
  return answer;
}
