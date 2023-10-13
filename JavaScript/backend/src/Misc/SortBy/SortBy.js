/**
 * @param {Array} arr
 * @param {Function} fn
 * @return {Array}
 */
var sortBy = function (arr, fn) {
  arr.sort((a, b) => fn(a) - fn(b))
  console.log('Array: ' + arr)

  return arr
}

let arr = [5, 4, 1, 2, 3]
let fn = (x) => x
console.log('sortby: ' + sortBy(arr, fn) + '\n')

arr = [{ x: 1 }, { x: 0 }, { x: -1 }]
fn = (d) => d.x
console.log('sortby: ' + sortBy(arr, fn) + '\n')

arr = [
  [3, 4],
  [5, 2],
  [10, 1],
]
fn = (x) => x[1]
console.log('sortby: ' + sortBy(arr, fn) + '\n')
