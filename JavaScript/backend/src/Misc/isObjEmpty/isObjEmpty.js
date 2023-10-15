var isEmpty = function (obj) {
  if (Array.isArray(obj)) {
    console.log('Array detected')
    return obj.length == 0
  }
  console.log('Obj detected')
  return Object.keys(obj).length == 0
}

// let obj = { x: 5, y: 42 }
// console.log('isEmpty: ' + isEmpty(obj) + '\n')

// obj = {}
// console.log('isEmpty: ' + isEmpty(obj) + '\n')

// obj = [null, false, 0]
// console.log('isEmpty: ' + isEmpty(obj) + '\n')

obj = []
console.log('isEmpty: ' + isEmpty(obj) + '\n')
