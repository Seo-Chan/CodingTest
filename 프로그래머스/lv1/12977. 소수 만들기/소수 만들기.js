function isPrime(num){
    if(num <1) return false;
    else if (num <=2) return true;
    
    for(var i=2; i<num; i++){
        if(num%i ==0) return false;
    }
    return true;
}

function solution(nums) {
    var answer = 0;

    for(var i=0; i<nums.length-2; i++){
        for(var j=i+1; j<nums.length-1; j++){
            for(var k=j+1; k<nums.length; k++){
                if(isPrime(nums[i]+nums[j]+nums[k])) answer++;
            }
        }
    }
    return answer;
}