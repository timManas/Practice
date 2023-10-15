/**
 * @param {Object|Array} obj
 * @return {boolean}
 */
var isEmpty = function (obj) {}

let obj = { x: 5, y: 42 }
console.log('isEmpty: ' + isEmpty(obj) + '\n')

obj = {}
console.log('isEmpty: ' + isEmpty(obj) + '\n')

obj = [null, false, 0]
console.log('isEmpty: ' + isEmpty(obj) + '\n')
