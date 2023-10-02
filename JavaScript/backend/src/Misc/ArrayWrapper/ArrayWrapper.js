class ArrayWrapper {
  constructor(arg) {
    console.log('constructor called')
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
ArrayWrapper.prototype.valueOf = function () {
  console.log('total: ' + this.total)
  return this.total
}

ArrayWrapper.prototype.toString = function () {
  // Why doesent this work ?
  //   return this.arr  -> I think its because this.arr still calls upon valueOf property ...

  // But '[' + this.arr.join(',') + ']' returns a string instead and does not invoke valueOf

  return '[' + this.arr.join(',') + ']'
}

const obj1 = new ArrayWrapper([1, 2])
const obj2 = new ArrayWrapper([3, 4])

console.log('obj1: ' + obj1)
console.log('obj2: ' + obj2 + '\n')

// console.log(obj1 + obj2) // 10
console.log(String(obj1)) // "[1,2]"
console.log(String(obj2)) // "[3,4]"

console.log('\n\n')
const obj3 = new ArrayWrapper([23, 98, 42, 70])
console.log(String(obj3)) // "[1,2]"
