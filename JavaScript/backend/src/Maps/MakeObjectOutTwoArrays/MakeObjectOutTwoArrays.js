/**
 * @param {Array} keysArr
 * @param {Array} valuesArr
 * @return {Object}
 */
var createObject = function (keysArr, valuesArr) {
  let output = {}

  for (let i = 0; i < keysArr.length; i++) {
    let key = keysArr[i]
    let value = valuesArr[i]

    if (output.hasOwnProperty(key)) continue

    output[key] = value
  }

  return output
}

let keysArr = ['a', 'b', 'c']
let valuesArr = [1, 2, 3]
console.log('createObj:  ' + createObject(keysArr, valuesArr) + '\n')

keysArr = ['1', 1, false]
valuesArr = [4, 5, 6]
console.log('createObj:  ' + createObject(keysArr, valuesArr) + '\n')

keysArr = []
valuesArr = []
console.log('createObj:  ' + createObject(keysArr, valuesArr) + '\n')
