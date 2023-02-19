// 문자열 내 p와 y의 갯수
// https://programmers.co.kr/learn/courses/30/lessons/12916

function numPY(s) {
  return (
    s.toUpperCase().split("P").length === s.toUpperCase().split("Y").length
  );
}
