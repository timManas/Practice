var maxArea = function (height) {
  let start = 0
  let end = height.length - 1

  let max = 0

  // Step1 - Create two indexes. If both are equal or pass each other. Break
  while (start < end) {
    // Step2 - Find the column length
    let leftCol = height[start]
    let rightCol = height[end]

    let area = 0

    // Step3 - Calculate the lengths
    if (leftCol == rightCol) {
      area = leftCol * (end - start) // Multiply by the width
      ++start
    } else if (leftCol > rightCol) {
      area = rightCol * (end - start)
      --end
    } else if (leftCol < rightCol) {
      area = leftCol * (end - start)
      ++start
    }

    console.log(
      'left: ' + leftCol + '      right: ' + rightCol + '    area: ' + area
    )

    // Step4 - Calculate the max
    max = max < area ? area : max
  }

  return max
}

let input = [
  [1, 8, 6, 2, 5, 4, 8, 3, 7],
  [1, 1],
]
for (let i = 0; i < input.length; i++) {
  let arr = input[i]
  console.log('Max Area: ' + maxArea(arr))
}
