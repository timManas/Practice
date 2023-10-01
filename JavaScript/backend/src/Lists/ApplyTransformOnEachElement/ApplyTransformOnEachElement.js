/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function (arr, fn) {
  let returnedArray = []
  for (let i = 0; i < arr.length; i++) {
    returnedArray[i] = fn(arr[i], i)
  }

  return returnedArray
}

let arr = [1, 2, 3]
let fn = function plusone(n) {
  return n + 1
}

arr = [1, 2, 3]
fn = function plusI(n, i) {
  return n + i
}

arr = [10, 20, 30]
fn = function constant() {
  return 42
}
