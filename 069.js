// 삼각형의 완성조건
// https://school.programmers.co.kr/learn/courses/30/lessons/120889

function solution(sides) {
  정렬 = sides.sort((a, b) => a - b);
  return 정렬[2] < 정렬[0] + 정렬[1] ? 1 : 2;
}
