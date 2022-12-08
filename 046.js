// 숨어있는 숫자의 덧셈(1)
// https://school.programmers.co.kr/learn/courses/30/lessons/120851

function solution(my_string) {
  return my_string.match(/[0-9]/g).reduce((a, b) => parseInt(a) + parseInt(b));
}
