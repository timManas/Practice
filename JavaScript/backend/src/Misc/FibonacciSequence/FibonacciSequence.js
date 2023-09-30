/**
 * @return {Generator<number>}
 */
var fibGenerator = function* () {
  var count = 0
  var prev1 = 0
  var prev2 = 0

  current = 0
  prev2 = 0
  yield 0

  current = 1
  prev1 = 1
  yield 1

  while (true) {
    let current = prev1 + prev2
    prev2 = prev1
    prev1 = current
    yield current
  }
}

const gen = fibGenerator()
console.log(gen.next().value) // 0
console.log(gen.next().value) // 1
console.log(gen.next().value) // 1
console.log(gen.next().value) // 2
console.log(gen.next().value) // 3
console.log(gen.next().value) // 5
