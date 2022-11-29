var isValid = function (s) {
  console.log('s: ' + s)
  let stack = []

  // Step1 - Traverse letter by letter
  for (let i = 0; i < s.length; i++) {
    let bracket = s[i]
    console.log('   char: ' + bracket)

    // Step2 - If Empty stack, we just add
    if (s.length == 0) {
      stack.push(bracket)
      continue
    }

    // Step3 -  Check what kind of Bracket it is
    // Remove the last brack if there is a match
    if (bracket == ')') {
      if (stack[stack.length - 1] == '(') {
        console.log('removing: ' + stack.pop())
        continue
      }
    } else if (bracket == '}') {
      if (stack[stack.length - 1] == '{') {
        console.log('removing: ' + stack.pop())
        continue
      }
    } else if (bracket == ']') {
      if (stack[stack.length - 1] == '[') {
        console.log('removing: ' + stack.pop())
        continue
      }
    }

    // Step4 - Add to stack
    stack.push(bracket)
  }

  return stack.length == 0
}

let input = ['()', '()[]{}', '(]']
for (let i = 0; i < input.length; i++) {
  console.log('isValid: ' + isValid(input[i]))
}
