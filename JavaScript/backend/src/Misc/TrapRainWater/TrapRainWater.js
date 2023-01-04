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
      ++leftIndex
      --rightIndex
      // Find min
      let min = Math.min(height[leftIndex], height[rightIndex])

      // Calculate range
      let range = rightIndex - leftIndex
      console.log(
        '   min: ' +
          min +
          '    range: ' +
          range +
          '  leftIndex: ' +
          leftIndex +
          '    rightIndex: ' +
          rightIndex
      )

      // Find the difference between the min and each of the lowest value and add
      while (leftIndex <= rightIndex) {
        let diff = min - height[leftIndex]

        if (diff <= 0) {
          leftIndex++
          continue
        }

        console.log(
          '   height[leftIndex]: ' + height[leftIndex] + '  diff: ' + diff
        )

        numWater += diff
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
