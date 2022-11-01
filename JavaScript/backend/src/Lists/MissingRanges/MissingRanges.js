var findMissingRanges = function (nums, lower, upper) {
  let output = []

  let current = lower
  let next = nums[0]
  let key = '->'

  if (lower < nums[0]) {
    // Add to output
    key = current + '->' + (nums[0] - 1)

    if (current == nums[0] - 1) key = '' + lower + ''
    output.push(key)
  }
  console.log('output: ' + output)

  for (let i = 0; i < nums.length - 1; i++) {
    current = nums[i]
    let next = nums[i + 1]

    let range = next - current
    console.log(
      'current:' + current + '    next: ' + next + '      range: ' + range
    )

    if (nums.includes(range)) {
      continue
    }

    key = current + 1 + '->' + (next - 1)
    if (current + 1 == next - 1) key = (current + 1).toString()

    output.push(key)
    console.log('output: ' + output)
  }

  if (upper == nums[nums.length - 1]) {
    return output
  }

  current = nums[nums.length - 1] + 1
  key = current + '->' + upper

  if (nums.length == 0) {
    key = lower + '->' + upper

    if (lower == upper) key = '' + upper + ''
  }

  output.push(key)

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
