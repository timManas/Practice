var findMissingRanges = function (nums, lower, upper) {
  let output = []

  // Step1 - If empty array, we just add the lower and upper
  if (nums.length == 0) {
    let limit = lower + '->' + upper
    if (lower == upper) limit = '' + upper + ''
    output.push(limit)
    return output
  }

  // Step2 - Create the variables
  let current = lower
  let next = 0
  let limit = '->'

  // Step3 - Check if lower limits
  if (lower < nums[0]) {
    // Add to output
    limit = current + '->' + (nums[0] - 1)

    if (current == nums[0] - 1) limit = '' + lower + ''
    output.push(limit)
  }
  console.log('output: ' + output)

  // Step4 - Traverse the nums Array
  for (let i = 0; i < nums.length - 1; i++) {
    current = nums[i]
    next = nums[i + 1]
    console.log('current:' + current + '    next: ' + next)

    // If current + 1 is in the array, we skip
    if (nums.includes(current + 1) || nums.includes(next - 1)) {
      continue
    }

    // Create the limit
    limit = current + 1 + '->' + (next - 1)
    if (current + 1 == next - 1) limit = (current + 1).toString()

    output.push(limit)
    console.log('output: ' + output)
  }

  // Step5 -  Check upper limits limits
  if (upper == nums[nums.length - 1]) {
    return output
  }

  current = nums[nums.length - 1] + 1
  limit = current + '->' + upper
  if (current == upper) limit = '' + current + ''

  // Push to output
  output.push(limit)

  return output
}

let nums = [0, 1, 3, 50, 75]
let lower = 0
let upper = 99
console.log(
  'Smallest Range of Missing #: ' + findMissingRanges(nums, lower, upper) + '\n'
)

nums = [-1]
lower = -1
upper = -1
console.log(
  'Smallest Range of Missing #: ' + findMissingRanges(nums, lower, upper) + '\n'
)

nums = []
lower = 1
upper = 1
console.log(
  'Smallest Range of Missing #: ' + findMissingRanges(nums, lower, upper) + '\n'
)

nums = [-1]
lower = -2
upper = -1
console.log(
  'Smallest Range of Missing #: ' + findMissingRanges(nums, lower, upper) + '\n'
)

nums = [-1]
lower = -1
upper = 0
console.log(
  'Smallest Range of Missing #: ' + findMissingRanges(nums, lower, upper) + '\n'
)

nums = []
lower = -3
upper = -1
console.log(
  'Smallest Range of Missing #: ' + findMissingRanges(nums, lower, upper) + '\n'
)

nums = [0, 9]
lower = 0
upper = 9
console.log(
  'Smallest Range of Missing #: ' + findMissingRanges(nums, lower, upper) + '\n'
)
