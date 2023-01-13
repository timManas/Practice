/**
 * @param {number[][]} mat
 * @return {number[][]}
 */
var diagonalSort = function (mat) {
  // Step1 - Traverse Vertically
  // You are moving Left to Right by Column (Y Axis)
  for (let y = 0; y < mat[0].length; y++) {
    console.log('y: ' + y)
    mat = sort(0, y, mat)
  }

  // Step2 - Traverse Horizontally
  // You are moving Top to Bottom by Row (X Axis)
  for (let x = 1; x < mat.length; x++) {
    console.log('x: ' + x)
    mat = sort(x, 0, mat)
  }

  return mat
}

function sort(x, y, mat) {
  let sorted = []

  // Step1 - Find all the elements diagonally
  let x_i = new Number(x)
  let y_i = new Number(y)
  while (x_i < mat.length && y_i < mat[0].length) {
    sorted.push(mat[x_i][y_i])
    ++x_i
    ++y_i
  }

  // Step2 - Sort them and reverse them to be popped
  sorted = sorted
    .sort(function (a, b) {
      return a - b
    })
    .reverse()
  console.log('sorted: ' + sorted)

  // Step3 - Pop off the list and back into the list
  while (x < mat.length && y < mat[0].length) {
    mat[x][y] = sorted.pop()
    ++x
    ++y
  }

  return mat
}

// let mat = [
//   [3, 3, 1, 1],
//   [2, 2, 1, 2],
//   [1, 1, 1, 2],
// ]
// console.log('Sorted: ' + diagonalSort(mat) + '\n')

let mat2 = [
  [11, 25, 66, 1, 69, 7],
  [23, 55, 17, 45, 15, 52],
  [75, 31, 36, 44, 58, 8],
  [22, 27, 33, 25, 68, 4],
  [84, 28, 14, 11, 5, 50],
]
console.log('Sorted: ' + diagonalSort(mat2) + '\n')
