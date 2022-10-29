var findMissingRanges = function (nums, lower, upper) {}

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
