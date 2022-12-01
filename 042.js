// 문자열 정렬하기(1)
function solution(my_string) {
    return my_string
        .match(/\d/g)
        .sort((a, b) => a - b)
        .map(Number);
}