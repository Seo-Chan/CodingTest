// 배열의 평균값

function solution(numbers) {
    return numbers.reduce((a, c) => a + c, 0) / numbers.length;
}