var threeSum = function (nums) {
  let output = []
  let set = new Set() // Keep track of all arrays stored
  let repeatedCharacters = new Set() // We need this set to keep track of avoid repeated characters during testing

  // Sort the input for easier maintenance
  nums.sort(function (a, b) {
    return a - b
  })
  console.log('nums: ' + nums)

  // Traverse left to right
  for (let x = 0; x < nums.length - 2; x++) {
    if (repeatedCharacters.has(nums[x])) continue

    // Traverse second number
    for (let y = x + 1; y < nums.length - 1; y++) {
      let remainder = -nums[x] - nums[y]

      // Traverse third number
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

        // If nums[x] + nums[y] + nums[z] == 0, then we save this into array
        // Only if it hasnt been added yet
        if (nums[z] == remainder) {
          console.log('Found ---- ')
          let temp = nums[x] + '|' + nums[y] + '|' + remainder
          if (!set.has(temp)) output.push([nums[x], nums[y], remainder])

          set.add(temp)
        }
      }
    }

    repeatedCharacters.add(nums[x])
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
