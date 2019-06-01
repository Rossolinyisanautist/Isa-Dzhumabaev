const input = require('fs').readFileSync('/dev/stdin', 'utf8')
const lines = input.split('\n')

const parts = lines[0].split(' ')
const pi = 3.14159

const n1 = parseInt(lines[0])
const n2 = n1 * n1 * pi
console.log("A=" + n2)

