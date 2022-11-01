var findMissingRanges = function (nums, lower, upper) {
  let map = new Map()

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

    map.set(key, range)
    console.log(map)
  }

  if (upper == nums[nums.length - 1]) {
    return map.keys()
  }

  let current = nums[nums.length - 1]
  let range = upper - current
  let key = current + 1 + '>' + upper

  map.set(key, range)
  console.log(map)

  return Array.from(map.keys())
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
