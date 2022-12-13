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

      let min = Math.min(height[leftIndex], height[rightIndex])

      // Update the indexes
      prevLeftIndex = leftIndex
      prevRightIndex = rightIndex
      leftIndex = --leftIndex
      rightIndex = ++rightIndex
      isBottom = true
    }

    if (isBottom) {
      console.log(
        '   HighestPoint left: ' +
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
