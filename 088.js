// 약수의 개수와 덧셈
// https://school.programmers.co.kr/learn/courses/30/lessons/77884

function solution(left, right) {
  let answer = 0;

  for (let i = left; i <= right; i++) {
    let p = 1;
    for (j = 2; j <= i; j++) {
      if (i % j == 0) p++;
    }

    if (p % 2 == 0) answer += i;
    else answer -= i;
  }

  return answer;
}
