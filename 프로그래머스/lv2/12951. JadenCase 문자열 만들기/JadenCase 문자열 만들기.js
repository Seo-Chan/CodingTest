function solution(s) {
    const arr = s.split(' ').map(list => list.toLowerCase())
    
    return arr.map(list => list.replace(list.charAt(0), list.charAt(0).toUpperCase())).join(' ')
}