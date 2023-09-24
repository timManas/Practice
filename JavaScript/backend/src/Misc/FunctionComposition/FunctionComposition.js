/**
 * @param {Function[]} functions
 * @return {Function}
 */
var compose = function (functions) {
  if (functions.length == 0) {
    return function (x) {
      return x
    }
  }

  return function (x) {
    var current = x
    for (var i = functions.length - 1; i >= 0; i--) {
      current = functions[i](current)
    }

    return current
  }
}

const fn = compose([(x) => x + 1, (x) => 2 * x])
console.log('result: ' + fn(4)) // 9

/**
 Function Composition
 Two things to note
 1. function(funcitons) ...actually refers to this line compose([(x) => x + 1, (x) => 2 * x])
 2. while function(x) ....actually refers to this line fn(4)

 Why is that ? 
 


*/
