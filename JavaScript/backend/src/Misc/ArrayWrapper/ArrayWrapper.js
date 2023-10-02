class ArrayWrapper {
  constructor(arg) {
    this.arr = arg
    this.calculateTotal(this.arr)
  }

  calculateTotal(arr) {
    this.total = 0
    for (let i = 0; i < arr.length; i++) {
      this.total += arr[i]
    }
  }
}

/**
 * @return {string}
 */

ArrayWrapper.prototype.toString = function () {
  console.log('arr: ' + this.arr)
  return this.arr
}

ArrayWrapper.prototype.add = function () {
  console.log('total: ' + this.total)
  return this.total
}

const obj1 = new ArrayWrapper([1, 2])
const obj2 = new ArrayWrapper([3, 4])
console.log(obj1 + obj2) // 10
console.log(String(obj1)) // "[1,2]"
console.log(String(obj2)) // "[3,4]"
