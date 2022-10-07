let traverse = function (matrix, n) {
  let arr = []
}

var rotate = function (matrix) {
  // Create Loop start from outside working inside

  let buffer = 0
  let mid = matrix.length % 2 == 0 ? matrix.length / 2 : matrix.length / 2 + 1

  while (buffer <= mid) {
    // Top: Left to Right
    let topRowIndex = 0
    for (let col = 0 + buffer; col < matrix.length - buffer; col++) {
      console.log(matrix[topRowIndex][col])
    }
    topRowIndex++

    // Right: Top to Bottom
    let rightColIndex = matrix.length - 1
    for (let row = 0 + buffer; row < matrix.length - buffer; row++) {
      console.log(matrix[row][rightColIndex])
    }
    rightColIndex--

    // Bottom: Right to Left
    let bottomRowIndex = matrix.length - 1
    for (let col = matrix.length - 1 - buffer; col >= 0 + buffer; col--) {
      console.log(matrix[bottomRowIndex][col])
    }

    // Left: Bottom to Top
    let leftColIndex = 0
    for (let row = matrix.length - 1 - buffer; row >= 0 + buffer; row--) {
      console.log(matrix[row][leftColIndex])
    }
    leftColIndex++

    console.log()

    buffer++
  }

  return matrix
}

let matrix = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9],
]
console.log('Rotated: ' + rotate(matrix))

matrix = [
  [5, 1, 9, 11],
  [2, 4, 8, 10],
  [13, 3, 6, 7],
  [15, 14, 12, 16],
]
console.log('Rotated: ' + rotate(matrix))
