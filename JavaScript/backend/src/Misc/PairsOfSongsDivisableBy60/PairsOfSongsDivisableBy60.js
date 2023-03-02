var numPairsDivisibleBy60 = function (time) {
  let total = 0
  for (let i = 0; i < time.length - 1; i++) {
    for (let j = i + 1; j < time.length; j++) {
      console.log('time[i]: ' + time[i] + '       time[j]: ' + time[j])

      if ((time[i] + time[j]) % 60 == 0) {
        console.log('Divisiable -- ')
        ++total
      }
    }
  }

  return total
}

let input = [
  [30, 20, 150, 100, 40],
  [60, 60, 60],
]
for (let i of input) {
  console.log('Num Divisable: ' + numPairsDivisibleBy60(i) + '\n')
}
