function solution(num, k) {
    var answer = num.toString().indexOf(k);
    if (answer >= 0) {
        return answer + 1;
    }
    else {
        return answer;
    }
}