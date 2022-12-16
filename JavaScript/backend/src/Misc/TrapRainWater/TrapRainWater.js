var trap = function (height) {
  console.log('height: ' + height)
  let numWater = 0

  // Traverse from left to right
  for (let i = 1; i < height.length - 1; i++) {
    let current = height[i]
    let prevLeftIndex = i
    let prevRightIndex = i
    let leftIndex = i - 1
    let rightIndex = i + 1
    let isBottom = false
    console.log('current: ' + current)

    // Traverse from center outwards
    while (
      height[prevLeftIndex] < height[leftIndex] &&
      height[prevRightIndex] < height[rightIndex]
    ) {
      console.log(
        '   left: ' +
          height[leftIndex] +
          ' prevLeft: ' +
          height[prevLeftIndex] +
          '   current: ' +
          height[i] +
          '  prevRight: ' +
          height[prevRightIndex] +
          '   right: ' +
          height[rightIndex]
      )

      // Update the indexes
      prevLeftIndex = leftIndex
      prevRightIndex = rightIndex
      leftIndex = --leftIndex
      rightIndex = ++rightIndex
      isBottom = true
    }

    if (isBottom) {
      // Find min
      let min = Math.min(height[leftIndex + 1], height[rightIndex - 1])

      // Calculate range
      let range = rightIndex - 1 - (leftIndex + 1)
      console.log(
        '   min: ' +
          min +
          '    range: ' +
          range +
          '  leftIndex: ' +
          (leftIndex + 1) +
          '    rightIndex: ' +
          (rightIndex - 1)
      )

      // Find the difference between the min and each of the loweest value and add
      while (leftIndex <= rightIndex) {
        numWater += min - height[leftIndex]
        leftIndex++
      }
      console.log('   numWater: ' + numWater)
    }
  }

  return numWater
}

let input = [
  [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1],
  [4, 2, 0, 3, 2, 5],
]
for (let i of input) {
  console.log('trap: ' + trap(i) + '\n')
}
