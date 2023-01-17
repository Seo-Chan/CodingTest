// 없는 숫자 더하기
// https://school.programmers.co.kr/learn/courses/30/lessons/86051

function solution(numbers) {
  let answer = 0;

  for (let i = 0; i <= 9; i++) {
    if (!numbers.includes(i)) answer += i;
  }

  return answer;
}
