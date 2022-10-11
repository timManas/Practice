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

    let subArray = nums.slice(i + 1, i + 1 + nums[i])
    subArray.sort()
    console.log('SubArray:' + subArray)

    stack = stack.concat(subArray)
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
