/**
 * @return {string}
 */

ArrayWrapper.prototype.toString = function () {
  return output
}

const obj1 = new ArrayWrapper([1, 2])
const obj2 = new ArrayWrapper([3, 4])
console.log(obj1 + obj2) // 10
console.log(String(obj1)) // "[1,2]"
console.log(String(obj2)) // "[3,4]"
