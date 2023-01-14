// 7의 개수
// https://school.programmers.co.kr/learn/courses/30/lessons/120912

function solution(array) {
  var string = array.toString();
  var sum = 0;
  for (let i = 0; i < string.length; i++) {
    string[i] === "7" ? (sum += 1) : 0;
  }
  return sum;
}
