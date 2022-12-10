// 외계행성의 나이
// https://school.programmers.co.kr/learn/courses/30/lessons/120834

function solution(age) {
  let char = "abcdefghij";
  return Array.from(age.toString())
    .map((t) => char[+t])
    .join("");
}
