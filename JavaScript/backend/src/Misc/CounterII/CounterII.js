/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function (init) {
  let counter = init

  function increment() {
    return ++counter
  }

  function decrement() {
    return --counter
  }

  function reset() {
    counter = init
    return counter
  }

  return { increment, decrement, reset }
}

var counter = createCounter(5)
counter.increment() // 6
counter.reset() // 5
counter.decrement() // 4
console.log('---')
counter = createCounter(0)
counter.increment() // 1
counter.increment() // 2
counter.decrement() // 1
counter.reset() // 0
counter.reset() // 0
