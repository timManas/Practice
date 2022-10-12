var canJump = function (nums) {
  console.log('nums: ' + nums)
  let stack = []
  let i = 0
  stack.push(i)

  while (stack.length > 0) {
    let i = stack.pop()

    if (i == nums.length - 1) {
      return true
    }

    console.log(
      'current index: ' + i + '   value: ' + nums[i] + '      stack: ' + stack
    )

    // Fetch highest index
    let subArray = nums.slice(i + 1, i + 1 + nums[i])
    subArray.sort()
    let largestJump = subArray[subArray.length - 1]
    console.log('SubArray:' + subArray + '  largestElement: ' + largestJump)

    // Create indexSubArray
    let indexSubArray = []
    let x = 0
    while (largestJump > 0) {
      indexSubArray.push(i + largestJump)
      largestJump--
    }

    // Add to stack
    stack = stack.concat(indexSubArray)
    console.log('stack: ' + stack)
  }

  return false
}

let input = [
  [2, 3, 1, 1, 4],
  [3, 2, 1, 0, 4],
]
for (let arr of input) {
  console.log('Able to reach end: ' + canJump(arr) + '\n')
}
