var threeSum = function (nums) {
  let output = []
  let set = new Set()

  // Sort the input for easier maintenance
  nums.sort(function (a, b) {
    return a - b
  })
  console.log('nums: ' + nums)

  for (let x = 0; x < nums.length - 2; x++) {
    // We move on if this number has been encountered before
    if (set.has(nums[x])) continue

    set.add(nums[x])

    for (let y = x + 1; y < nums.length - 1; y++) {
      let remainder = -nums[x] - nums[y]

      for (let z = y + 1; z < nums.length; z++) {
        // Add an automatic break
        if (nums[z] > remainder) break

        console.log(
          'x: ' +
            nums[x] +
            '     y:' +
            nums[y] +
            '    z:' +
            nums[z] +
            '   remainder: ' +
            remainder
        )
        if (nums[z] == remainder) {
          console.log('Found ----')
          output.push([nums[x], nums[y], remainder])
        }
      }
    }
  }
  console.log('output: ' + output)
  return output
}

let input = [
  [-1, 0, 1, 2, -1, -4],
  [0, 1, 1],
  [0, 0, 0, 0],
]
for (let i = 0; i < input.length; i++) {
  console.log('All tripletS: ' + threeSum(input[i]) + '\n')
}
