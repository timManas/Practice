/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function (nums, fn, init) {
  let val = init

  for (let i = 0; i < nums.length; i++) {
    val = fn(val, nums[i])
  }

  return val
}

// Ex1
let nums = [1, 2, 3, 4]
let fn = function sum(accum, curr) {
  return accum + curr
}
let init = 0
console.log('reduce: ' + reduce(nums, fn, init))

// Ex2
nums = [1, 2, 3, 4]
fn = function sum(accum, curr) {
  return accum + curr * curr
}
init = 100
console.log('reduce: ' + reduce(nums, fn, init))

// Ex3
nums = []
fn = function sum(accum, curr) {
  return 0
}
init = 25
console.log('reduce: ' + reduce(nums, fn, init))
