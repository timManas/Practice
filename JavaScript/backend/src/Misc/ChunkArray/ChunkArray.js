/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array}
 */
var chunk = function (arr, size) {
  let output = []
  // If length == 0
  if (arr.length == 0) return []

  // If size is bigger than the arr
  if (arr.length < size) {
    let temp = arr
    output.push(temp)
    return output
  }

  // Start from left to right, create a new array after after limit is reached
  let temp = []
  for (let i = 0; i < arr.length; i++) {
    temp.push(arr[i])

    // Check the size
    if (temp.length == size) {
      output.push(temp)
      temp = []
      continue
    }
  }

  // Check if there is still left over array
  if (temp.length > 0) {
    output.push(temp)
  }

  return output
}

// Ex1
let arr = [1, 2, 3, 4, 5]
let size = 1
console.log('chunk: ' + chunk(arr, size))

// Ex2
arr = [1, 9, 6, 3, 2]
size = 3
console.log('chunk: ' + chunk(arr, size))

// Ex3
arr = [8, 5, 3, 2, 6]
size = 6
console.log('chunk: ' + chunk(arr, size))

// Ex4
arr = []
size = 1
console.log('chunk: ' + chunk(arr, size))
