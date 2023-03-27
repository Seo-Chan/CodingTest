// 이상한 문자 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/12930

function toWeirdCase(s) {
  return s
    .split(" ")
    .map((a) => {
      return a
        .split("")
        .map((b, i) => {
          return i % 2 === 0 ? b.toUpperCase() : b.toLowerCase();
        })
        .join("");
    })
    .join(" ");
}
