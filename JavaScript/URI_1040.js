const input = require('fs').readFileSync('/dev/stdin', 'utf8')
const lines = input.split('\n')

const parts = lines[0].split(' ')
const n1 = parseFloat(parts[0])
const n2 = parseFloat(parts[1])
const n3 = parseFloat(parts[2])
const n4 = parseFloat(parts[3])

let avg = (n1 * 2 + n2 * 3 + n3 * 4 + n4) / 10
console.log(`Media: ${avg.toFixed(1)}`)

if (avg >= 7.0) {
    console.log('Aluno aprovado.')
} else if (avg < 5.0) {
    console.log('Aluno reprovado.')
} else {
    const exam = parseFloat(lines[1])
    avg = (avg + exam) / 2

    const message = avg >= 5.0 ? 'Aluno aprovado.\n' : 'Aluno reprovado.\n'
    console.log(
        `Aluno em exame.\n`        +
        `Nota do exame: ${exam.toFixed(1)}\n` +
        message +
        `Media final: ${avg.toFixed(1)}`)
}

