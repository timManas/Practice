/**
 * @param {string} val
 * @return {Object}
 */
// var expect = function (val) {
//   const obj = {
//     val: val,
//     toBe: (params) => {
//       console.log('params: ' + params)
//     },
//     notToBe: (params) => {
//       console.log('params : ' + params)
//     },
//   }
//   return obj
// }

var expect = function (val) {
  const obj = {
    val: val,
    toBe: toBeFunc,
    notToBe: notToBeFunc,
  }
  return obj
}

const toBeFunc = function (params) {
  console.log('params: ' + params)
  return this
}

const notToBeFunc = function (params) {
  console.log('params: ' + params)
  return this
}

// console.log(expect(5))
console.log(expect(5).toBe(5)) // true
// console.log(expect(5).notToBe(6)) // throws "Equal"
