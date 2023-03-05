// 수박수박수박수박수?
// https://school.programmers.co.kr/learn/courses/30/lessons/12922

function waterMelon(n) {
  var result = "";
  for (var i = 0; i < n; i++) {
    result += i % 2 == 0 ? "수" : "박";
  }
  return result;
}
