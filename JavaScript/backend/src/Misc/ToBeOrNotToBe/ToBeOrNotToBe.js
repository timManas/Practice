/**
 * @param {string} val
 * @return {Object}
 */

var expect = function (val) {
  this.val = val
  this.toBe = toBeFunc
  this.notToBe = notToBeFunc
  return this
}

const toBeFunc = function (params) {
  console.log('toBeFunc params: ' + params + '  val: ' + this.val)

  if (this.val === params) {
    return true
  }

  throw new Error('Not Equal')
}

const notToBeFunc = function (params) {
  console.log('notToBeFunc params: ' + params + '  val: ' + this.val)

  if (this.val !== params) {
    return true
  }

  throw new Error('Equal')
}

// console.log(expect(5))
console.log(expect(5).toBe(5)) // true
console.log(expect(5).toBe(null)) // throws "Equal"
console.log(expect(5).notToBe(null)) // throws "Equal"
