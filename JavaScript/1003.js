// const input = require('fs').readFileSync('/dev/stdin', 'utf-8')
const input = require('fs').readFileSync('main.txt', 'utf-8')
const lines = input.split('\n')

const parts1 = lines[0].split(' ')

const A = parseFloat(parts1[0])
if(A == 0) {
    process.stdout.write("Impossivel calcular\n")
}
else{
    const B = parseFloat(parts1[1])
    const C = parseFloat(parts1[2])

    const D = B * B - (4 * A * C)

    if(D < 0){
        process.stdout.write("Impossivel calcular\n")            
    }
    else{
        let x1 = (-1 * B + Math.sqrt(D)) / (2 * A)
        let x2 = (-1 * B - Math.sqrt(D)) / (2 * A)
        process.stdout.write("R1 = " + x1.toFixed(5) + "\nR2 = " + x2.toFixed(5) + "\n")    
    }
}

