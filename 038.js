// 숨어있는 숫자의 덧셈(1)

function solution(my_string) {
    return Array
        .from(my_string)
        .map(v => +v)
        .filter(v => !Number.isNaN(v))
        .reduce((a, c) => a + c, 0);
}