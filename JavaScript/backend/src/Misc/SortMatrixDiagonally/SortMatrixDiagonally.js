/**
 * @param {number[][]} mat
 * @return {number[][]}
 */
var diagonalSort = function (mat) {
  // Traverse Horizontally
  for (let x = 0; x < mat[0].length; x++) {
    mat = sort(0, x, mat)
  }

  // Traverse Vertically
  for (let y = 0; y < mat.length; y++) {
    mat = sort(y, 0, mat)
  }

  return mat
}

function sort(x, y, mat) {}

let mat = [
  [3, 3, 1, 1],
  [2, 2, 1, 2],
  [1, 1, 1, 2],
]
console.log('Sorted: ' + diagonalSort(mat))
