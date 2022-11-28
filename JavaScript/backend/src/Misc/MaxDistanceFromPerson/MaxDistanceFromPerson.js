var maxDistToClosest = function (seats) {
  let max = 0

  console.log('input: ' + seats)
  let onesArr = fetchOnesArr(seats)
  console.log('onesArr: ' + onesArr)

  // Check the first position

  // Traverse onesArr
  for (let i = 0; i < onesArr.length; i++) {
    // Find the median
  }

  // Check the last position

  return max
}

function fetchOnesArr(seats) {
  let output = []

  for (let i = 0; i < seats.length; i++) {
    if (seats[i] == 1) output.push(i)
  }
  return output
}

let input = [
  [1, 0, 0, 0, 1, 0, 1],
  [1, 0, 0, 0],
  [0, 1],
]

for (let i = 0; i < input.length; i++) {
  console.log('output: ' + maxDistToClosest(input[i]) + '\n')
}
