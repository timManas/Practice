var plusOne = function (digits) {
  // Step1 - Reverse the array. Much faster to traverse
  digits.reverse()
  console.log('reversed: ' + digits)

  // Step2 - Start from 0 to end
  // Only increment first element.
  let remainder = 0
  for (let i = 0; i < digits.length; i++) {
    let current = digits[i]

    // Step3 - Increment first element
    if (i == 0) {
      current = digits[i] + 1
    } else {
      // Step4 - Just add the remainder
      current = digits[i] + remainder
    }

    // Step4 - Check the current number and modify remainder
    if (current >= 10) {
      remainder = 1
      digits[i] = 0
    } else {
      remainder = 0
      digits[i] = current
    }
  }

  // Step5 - Check the remainder
  if (remainder == 1) digits.push(1)

  // Step6 - Reverse array to return to original order
  digits.reverse()
  return digits
}

let input = [[1, 2, 3], [4, 3, 2, 1], [9], [9, 9]]
for (let i in input) {
  console.log('Plus one: ' + plusOne(input[i]) + '\n')
}
