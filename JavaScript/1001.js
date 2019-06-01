const input = require('fs').readFileSync('/dev/stdin', 'utf8')
const lines = input.split('\n')

const parts = lines[0].split(' ')

const n1 = parseInt(lines[0])
const n2 = parseInt(lines[1])
const n3 = n1 + n2
console.log("X = " + n3)

