function solution(name, yearning, photo) {
    let answer = [];
    let sum = 0;
    for(let i=0; i<photo.length; i++){
        for(let j=0; j<photo[i].length; j++){
            name.map(v=>{
                if(v===photo[i][j]){
                    sum += yearning[name.indexOf(v)]
                }
            })
        }      
       answer.push(sum);
        sum = 0;
    }
    return answer;
}