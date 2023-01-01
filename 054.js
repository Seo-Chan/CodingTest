// 모음제거
// https://school.programmers.co.kr/learn/courses/30/lessons/120849

function solution(my_string) {
  return Array.from(my_string)
    .filter((t) => !["a", "e", "i", "o", "u"].includes(t))
    .join("");
}
