function solution(my_string) {
    var answer = '';
    for (let item of my_string) {
        if (item === item.toUpperCase()) {
            answer += item.toLowerCase();
        }
        else {
            answer += item.toUpperCase();
        }
    }
    return answer;
}