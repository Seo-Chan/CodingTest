// 문자 반복 출력하기
// https://school.programmers.co.kr/learn/courses/30/lessons/120825

function solution(my_string, n) {
  var answer = [...my_string].map((v) => v.repeat(n)).join("");
  console.log(answer);
  return answer;
}
