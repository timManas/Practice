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
  // Step1 - Top: Left to Right
  for (let col = 0 + buffer; col < matrix.length - buffer; col++) {
    if (type == 'GET') {
      let current = matrix[topRowIndex][col]
      arr.push(current)

      if (col == matrix.length - 1 - buffer) {
        arr.pop()
      }
    } else if (type == 'SET') {
      if (col == matrix.length - 1 - buffer) {
        continue
      }

      matrix[topRowIndex][col] = arr.pop()
    }
  }

  // Step2 - Right: Top to Bottom
  for (let row = 0 + buffer; row < matrix.length - buffer; row++) {
    if (type == 'GET') {
      let current = matrix[row][rightColIndex]
      arr.push(current)

      if (row == matrix.length - 1 - buffer) {
        arr.pop()
      }
    } else if (type == 'SET') {
      if (row == matrix.length - 1 - buffer) {
        continue
      }

      matrix[row][rightColIndex] = arr.pop()
    }
  }

  // Step3 - Bottom: Right to Left
  for (let col = matrix.length - 1 - buffer; col >= 0 + buffer; col--) {
    if (type == 'GET') {
      let current = matrix[bottomRowIndex][col]
      arr.push(current)

      if (col == 0 + buffer) {
        arr.pop()
      }
    } else if (type == 'SET') {
      if (col == 0 + buffer) {
        continue
      }

      matrix[bottomRowIndex][col] = arr.pop()
    }
  }

  // Step5 - Left: Bottom to Top
  for (let row = matrix.length - 1 - buffer; row >= 0 + buffer; row--) {
    if (type == 'GET') {
      let current = matrix[row][leftColIndex]
      arr.push(current)

      if (row == 0 + buffer) {
        arr.pop()
      }
    } else if (type == 'SET') {
      if (row == 0 + buffer) {
        continue
      }

      matrix[row][leftColIndex] = arr.pop()
    }
  }

  return arr
}

var rotate = function (matrix) {
  // Step 1 - Find the boundaries
  let buffer = 0

  // Step2 - Create output array
  let arr = []

  let mid = matrix.length % 2 == 0 ? matrix.length / 2 : matrix.length / 2 + 1

  // Step3 - Initialize the index
  let topRowIndex = 0
  let rightColIndex = matrix.length - 1
  let bottomRowIndex = matrix.length - 1
  let leftColIndex = 0

  // Step4 - Start from 0x0 then move to 1x1, 2x2 etc ...
  while (buffer <= mid) {
    // Step5 - Find the outer values to be shifted
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
    console.log('arr: ' + arr)

    // Step6 - Shift Array
    let beginning = arr.slice(0, arr.length - arr.length / 4)
    let end = arr.slice(arr.length - arr.length / 4, arr.length)
    arr = end.concat(beginning)
    console.log('beginnging: ' + beginning + '    end: ' + end)
    console.log('Shifted arr: ' + arr)

    // Step7- Repopulate the matrix
    arr = arr.reverse()
    traverseMatrix(
      arr,
      'SET',
      matrix,
      buffer,
      topRowIndex,
      rightColIndex,
      bottomRowIndex,
      leftColIndex
    )

    // Step8 - Update the index
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
console.log('Rotated: ' + rotate(matrix) + '\n')

matrix = [
  [5, 1, 9, 11],
  [2, 4, 8, 10],
  [13, 3, 6, 7],
  [15, 14, 12, 16],
]
console.log('Rotated: ' + rotate(matrix) + '\n')
