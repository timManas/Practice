/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function (arr, fn) {
  let output = []

  for (let i = 0; i < arr.length; i++) {
    if (fn(arr[i])) {
      output.push(arr[i])
    }
  }

  return output
}

let arr = [0, 10, 20, 30]
fn = function greaterThan10(n) {
  return n > 10
}

arr = [1, 2, 3]
fn = function firstIndex(n, i) {
  return i === 0
}

arr = [-2, -1, 0, 1, 2]
fn = function plusOne(n) {
  return n + 1
}
