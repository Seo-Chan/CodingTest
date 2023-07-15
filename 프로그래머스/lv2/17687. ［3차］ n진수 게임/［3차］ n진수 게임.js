function solution(n, t, m, p) {
  let str = "";

  for (let i = 0; str.length < m * t; i++) {
    str += i.toString(n).toUpperCase();
  }

  let answer = "";
  let cnt = 0;

  while (answer.length < t) {

    // 인원 수 만큼 문자열을 자른다.
    const s = str.substring(cnt, cnt + m);

    // 인덱스는 0부터이므로 튜브의 순서 - 1
    answer += s[p - 1];
    cnt += m;
  }
  return answer;
}