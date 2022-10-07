var rotate = function (matrix) {
  // Create output array
  let arr = []

  // Find the boundaries
  let buffer = 0
  let mid = matrix.length % 2 == 0 ? matrix.length / 2 : matrix.length / 2 + 1

  // Initialize the index
  let topRowIndex = 0
  let rightColIndex = matrix.length - 1
  let bottomRowIndex = matrix.length - 1
  let leftColIndex = 0

  // Start from 0x0 then move to 1x1, 2x2 etc ...
  while (buffer <= mid) {
    // Top: Left to Right
    for (let col = 0 + buffer; col < matrix.length - buffer; col++) {
      let current = matrix[topRowIndex][col]
      console.log(current)
      arr.push(current)
    }
    ++topRowIndex
    arr.pop()

    // Right: Top to Bottom
    for (let row = 0 + buffer; row < matrix.length - buffer; row++) {
      let current = matrix[row][rightColIndex]
      console.log(current)
      arr.push(current)
    }
    --rightColIndex
    arr.pop()

    // Bottom: Right to Left
    for (let col = matrix.length - 1 - buffer; col >= 0 + buffer; col--) {
      let current = matrix[bottomRowIndex][col]
      console.log(current)
      arr.push(current)
    }
    --bottomRowIndex
    arr.pop()

    // Left: Bottom to Top
    for (let row = matrix.length - 1 - buffer; row >= 0 + buffer; row--) {
      let current = matrix[row][leftColIndex]
      console.log(current)
      arr.push(current)
    }
    ++leftColIndex
    arr.pop()

    console.log()

    buffer++ // Increase Buffer Size
  }

  console.log('matrix: ' + arr)
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
