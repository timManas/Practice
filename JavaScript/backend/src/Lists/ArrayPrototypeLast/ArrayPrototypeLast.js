Array.prototype.last = function () {
  return this.length == 0 ? -1 : this[this.length - 1]
}

const arr = [null, {}, 3]
console.log(arr.last()) // 3

const arr1 = [1, 2, 3]
console.log(arr1.last()) // 3

const arr2 = []
console.log(arr2.last()) // 3
