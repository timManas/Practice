/**
 * @param {number} target
 * @return {number}
 */
Array.prototype.upperBound = function (target) {
  for (let i = this.length - 1; i >= 0; i--) {
    let current = this[i]
    console.log('current: ' + current)

    if (current == target) return i
  }

  return -1
}

console.log([3, 4, 5].upperBound(5) + '\n') //2
console.log([1, 4, 5].upperBound(2) + '\n') // -1
console.log([3, 4, 6, 6, 6, 6, 7].upperBound(6) + '\n') // 5
