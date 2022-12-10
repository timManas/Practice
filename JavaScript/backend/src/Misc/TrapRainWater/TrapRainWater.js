var trap = function (height) {
  console.log('height: ' + height)

  for (let i = 1; i < height.length - 1; i++) {
    let current = height[i]
    let prevLeftIndex = i
    let prevRightIndex = i
    let leftIndex = i - 1
    let rightIndex = i + 1
    console.log('current: ' + current)

    while (
      height[prevLeftIndex] < height[leftIndex] &&
      height[prevRightIndex] < height[rightIndex]
    ) {}
  }
}

let input = [
  [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1],
  [4, 2, 0, 3, 2, 5],
]
for (let i of input) {
  console.log('trap: ' + trap(i) + '\n')
}
