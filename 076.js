// 신규 아이디 추천
// https://school.programmers.co.kr/learn/courses/30/lessons/72410

function solution(new_id) {
  let answer = new_id;

  // 1
  answer = answer.toLowerCase();
  // 2
  answer = answer.replace(/[^a-z0-9-_.]/gi, "");
  // 3
  answer = answer.replace(/\.+/gi, ".");
  // 4
  answer = answer.replace(/^\.|\.$/gi, "");

  // 5
  if (answer.length === 0) answer = "a";

  // 6
  if (answer.length >= 16) answer = answer.slice(0, 15);
  answer = answer.replace(/\.$/, "");

  // 7
  if (answer.length <= 2) {
    while (answer.length !== 3) {
      answer += answer[answer.length - 1];
    }
  }

  return answer;
}
