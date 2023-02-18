// 같은 숫자는 싫어
// https://programmers.co.kr/learn/courses/30/lessons/12906

function weDontLikeSameNumber(arr) {
  let answer = [];
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] === arr[i + 1]) {
    } else {
      answer.push(arr[i]);
    }
  }
  return answer;
}
