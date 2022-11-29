var isValid = function (s) {
  console.log('s: ' + s)
}

let input = ['()', '()[]{}', '(]']
for (let i = 0; i < input.length; i++) {
  console.log('isValid: ' + isValid(input[i]))
}
