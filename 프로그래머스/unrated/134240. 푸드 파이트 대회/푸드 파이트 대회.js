function solution(food) {
    let answer = '';
    let player1 = '';
    let player2 = '';
    for(let i = 1; i<food.length; i++){
        let num = parseInt(food[i]/2);
        for(let j = 1; j<=num; j++){
            player1 += i
        }
    }
    player2 = player1.split('').reverse().join('');
    answer = player1 + '0' + player2
    return answer;
}