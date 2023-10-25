/**
 * @param {number} n
 * @yields {number}
 */
function* factorial(n) {
  yield 1

  let output = [1]
  let i = 2
  while (i <= n) {
    let factorial = i * output[output.length - 1]
    output.push(factorial)

    console.log('factorial: ' + factorial)
    i++

    yield factorial
  }
}

const gen = factorial(5)
console.log(gen.next().value) // 1
console.log(gen.next().value) // 2
console.log(gen.next().value) // 6
console.log(gen.next().value) // 24
console.log(gen.next().value) // 120
