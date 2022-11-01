var findMissingRanges = function (nums, lower, upper) {
  let output = []

  for (let i = 0; i < nums.length - 1; i++) {
    let current = nums[i]
    let next = nums[i + 1]
    let range = next - current
    console.log(
      'current:' + current + '    next: ' + next + '      range: ' + range
    )

    if (nums.includes(range)) {
      continue
    }

    let key = current + 1 + '->' + (next - 1)
    if (current + 1 == next - 1) key = (current + 1).toString()

    output.push(key)
    console.log('output: ' + output)
  }

  if (upper == nums[nums.length - 1]) {
    return output
  }

  let current = nums[nums.length - 1] + 1
  let key = current + '->' + upper

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
