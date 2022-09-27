let input = [
  ['--X', 'X++', 'X++'],
  ['++X', '++X', 'X++'],
  ['X++', '++X', '--X', 'X--'],
]

var finalValueAfterOperations = function (operations) {
  let value = 0

  for (let x = 0; x < operations.length; x++) {
    console.log(operations[x])

    if (operations[x].includes('+')) {
      ++value
    } else if (operations[x].includes('-')) {
      --value
    }
  }

  return value
}

for (let i = 0; i < input.length; i++) {
  let arr = input[i]
  let result = finalValueAfterOperations(arr)
  console.log('result: ' + result)
}
