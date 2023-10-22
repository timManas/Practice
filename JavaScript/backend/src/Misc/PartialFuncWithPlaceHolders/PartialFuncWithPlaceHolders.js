var partial = function (fn, args) {
  let newArgs = [...args]
  return function (...restArgs) {
    let j = 0
    for (let i = 0; i < newArgs.length; i++) {
      let current = newArgs[i]

      if (current != '_') continue

      newArgs[i] = restArgs[j]
      j++
    }

    while (j < restArgs.length) {
      let restCurrent = restArgs[j]
      newArgs.push(restCurrent)
      j++
    }

    return fn(...newArgs) // Dont forget the "..." in args. This is more commonly accepted instead of just args
  }
}

let fn = (...args) => args
let args = [2, 4, 6]
let restArgs = [8, 10]
let partialFn = partial(fn, args)
let result = partialFn(...restArgs)
console.log(result + '\n') // [2,4,6,8,10]

fn = (...args) => args
args = [1, 2, '_', 4, '_', 6]
restArgs = [3, 5]
partialFn = partial(fn, args)
result = partialFn(...restArgs)
console.log(result + '\n') // [1,2,3,4,5,6]

fn = (a, b, c) => b + a - c
args = ['_', 5]
restArgs = [5, 20]
partialFn = partial(fn, args)
result = partialFn(...restArgs)
console.log(result + '\n') // -10
