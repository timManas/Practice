let input = [
  [0, 2, 1, 5, 3, 4],
  [5, 0, 1, 2, 3, 4],
]

// Make sure this is defined before the main for loop on line 18
var buildArray = function (nums) {
  // Step1 - Create an empty list
  let outputArr = []

  // Step2 - Find the zero-based permutation
  for (let i = 0; i < nums.length; i++) {
    outputArr[i] = nums[nums[i]]
  }
  return outputArr
}

for (let i = 0; i < input.length; i++) {
  console.log('nums: ' + input[i])
  let output = buildArray(input[i])
  console.log('Output: ' + output + '\n')
}
