function traverseMatrix(
  arr,
  type,
  matrix,
  buffer,
  topRowIndex,
  rightColIndex,
  bottomRowIndex,
  leftColIndex
) {
  // Top: Left to Right
  for (let col = 0 + buffer; col < matrix.length - buffer; col++) {
    let current = matrix[topRowIndex][col]

    if (type == 'GET') {
      console.log(current)
      arr.push(current)

      if (col == matrix.length - 1 - buffer) {
        arr.pop()
      }
    } else if (type == 'SET') {
    }
  }

  // Right: Top to Bottom
  for (let row = 0 + buffer; row < matrix.length - buffer; row++) {
    if (type == 'GET') {
      let current = matrix[row][rightColIndex]
      console.log(current)
      arr.push(current)

      if (row == matrix.length - 1 - buffer) {
        arr.pop()
      }
    } else if (type == 'SET') {
    }
  }

  // Bottom: Right to Left
  for (let col = matrix.length - 1 - buffer; col >= 0 + buffer; col--) {
    if (type == 'GET') {
      let current = matrix[bottomRowIndex][col]
      console.log(current)
      arr.push(current)

      if (col == 0 + buffer) {
        arr.pop()
      }
    } else if (type == 'SET') {
    }
  }

  // Left: Bottom to Top
  for (let row = matrix.length - 1 - buffer; row >= 0 + buffer; row--) {
    if (type == 'GET') {
      let current = matrix[row][leftColIndex]
      console.log(current)
      arr.push(current)

      if (row == 0 + buffer) {
        arr.pop()
      }
    } else if (type == 'SET') {
    }
  }

  return arr
}

var rotate = function (matrix) {
  // Find the boundaries
  let buffer = 0

  // Create output array
  let arr = []

  let mid = matrix.length % 2 == 0 ? matrix.length / 2 : matrix.length / 2 + 1

  // Initialize the index
  let topRowIndex = 0
  let rightColIndex = matrix.length - 1
  let bottomRowIndex = matrix.length - 1
  let leftColIndex = 0

  // Start from 0x0 then move to 1x1, 2x2 etc ...
  while (buffer <= mid) {
    traverseMatrix(
      arr,
      'GET',
      matrix,
      buffer,
      topRowIndex,
      rightColIndex,
      bottomRowIndex,
      leftColIndex
    )

    console.log('fetch arr values: ' + arr)

    // Update the index
    ++topRowIndex
    --rightColIndex
    --bottomRowIndex
    ++leftColIndex

    buffer++ // Increase Buffer Size
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
