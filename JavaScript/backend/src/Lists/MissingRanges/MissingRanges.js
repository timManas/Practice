var findMissingRanges = function (nums, lower, upper) {
  let map = new Map()

  for (let i = 0; i < nums.length; i++) {
    let current = nums[i]

    if (i == nums.length - 1 && current == upper) {
      break
    }

    let next = i != nums.length - 1 ? nums[i + 1] : upper
    let range = next - current
    console.log(
      'current:' + current + '    next: ' + next + '      range: ' + range
    )

    if (nums.includes(range)) {
      continue
    }

    let key = current + 1 + '>' + (next - 1)
    map.set(key, range)
    console.log(map)
  }
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
