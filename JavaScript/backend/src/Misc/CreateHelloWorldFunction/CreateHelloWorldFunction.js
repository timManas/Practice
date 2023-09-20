/**
 * @return {Function}
 */
var createHelloWorld = function () {
  return function (...args) {
    'Hello World'
  }
}

const f = createHelloWorld()
console.log(f()) // "Hello World"
console.log(f({}, null, 42)) // "Hello World"
