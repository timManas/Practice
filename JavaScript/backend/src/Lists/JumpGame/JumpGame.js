var canJump = function (nums) {
  console.log('nums: ' + nums)
}

let input = [
  [2, 3, 1, 1, 4],
  [3, 2, 1, 0, 4],
]
for (let arr in input) {
  console.log('Able to reach end: ' + canJump(arr))
}
