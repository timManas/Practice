let input = [
  [1, 2, 1],
  [1, 3, 2, 1],
]

for (let i = 0; i < input.length; i++) {
  var getConcatenation = function (nums) {
    console.log('Input: ' + nums)
    return nums.concat(nums) // Step1 : Use Concatenate built in method to expand list
  }

  console.log('Result: ' + getConcatenation(input[i]) + '\n')
}
