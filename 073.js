// 배열 회전 시키기
// https://school.programmers.co.kr/learn/courses/30/lessons/120844

function solution(numbers, direction) {
  var answer = [];
  if ("right" == direction) {
    numbers.unshift(numbers.pop());
  } else {
    numbers.push(numbers.shift());
  }
  answer = numbers;
  return answer;
}
