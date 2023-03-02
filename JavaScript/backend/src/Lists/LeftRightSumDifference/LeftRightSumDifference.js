/**
 * @param {number[]} nums
 * @return {number[]}
 */
var leftRigthDifference = function (nums) {
  // Find total
  let total = 0
  for (let x of nums) total += x
  console.log('total: ' + total)

  let output = []
  let leftSum = []
  let rightSum = []
  let leftTotal = 0
  let rightTotal = 0

  for (let i = 0; i < nums.length; i++) {
    let current = nums[i]
    leftTotal += i == 0 ? 0 : nums[i - 1]
    leftSum.push(leftTotal)
    rightSum.push(total - leftTotal - current)
  }

  console.log('leftSum: ' + leftSum)
  console.log('rightSum: ' + rightSum)

  for (let i = 0; i < nums.length; i++) {
    output.push(Math.abs(leftSum[i] - rightSum[i]))
  }

  return output
}

let input = [[10, 4, 8, 3], [1]]
for (let x of input) {
  console.log('difference: ' + leftRigthDifference(x) + '\n')
}
