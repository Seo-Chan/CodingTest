function solution(n) {
    let arr = n.toString().split("").map(Number);
    let sum = 0;
    for (const i of arr) {
        sum += i;
    }
    return sum;
}