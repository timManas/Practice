var maxDistToClosest = function (seats) {
  let max = 0

  console.log('input: ' + seats)
  let onesArr = fetchOnesArr(seats)
  console.log('onesArr: ' + onesArr)

  // Step1 - Check the first position
  if (!onesArr.includes(0)) {
    let current = 0
    let next = onesArr[0]
    let median = next - current
    max = max < median ? median : max
    console.log(
      '   current: ' + current + '   next: ' + next + '    median: ' + median
    )
  }

  // Step2 - Traverse onesArr
  for (let i = 0; i < onesArr.length - 1; i++) {
    let current = onesArr[i]
    let next = onesArr[i + 1]
    //  Step2a - Find the median
    let median = Math.floor((next - current) / 2)
    max = max < median ? median : max
    console.log(
      '   current: ' + current + '   next: ' + next + '    median: ' + median
    )
  }

  // Step3 - Check the last position
  if (!onesArr.includes(seats.length - 1)) {
    let current = onesArr[onesArr.length - 1]
    let next = seats.length - 1
    let median = next - current
    max = max < median ? median : max
    console.log(
      '   current: ' + current + '   next: ' + next + '    median: ' + median
    )
  }

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
  [1, 0, 0, 1],
]

for (let i = 0; i < input.length; i++) {
  console.log('output: ' + maxDistToClosest(input[i]) + '\n')
}
