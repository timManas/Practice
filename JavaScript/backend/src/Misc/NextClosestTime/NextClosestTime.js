var nextClosestTime = function (time) {
  // Get Digits & Sort
  time = time.substring(0, 2) + '' + time.substring(3, 5)
  time = time.split('')
  let digits = time.slice().sort()

  console.log('digits: ' + digits + '     time: ' + time)

  // Start from the Right moving up
  let isSettled = false
  for (let i = time.length - 1; i >= 0; i--) {
    let current = time[i]
    console.log('current: ' + current)

    let indexNext =
      digits.indexOf(current) == digits.length - 1
        ? 0
        : digits.indexOf(current) + 1
    let next = digits[indexNext]

    console.log('current: ' + current + '   next:' + next)

    if (isSettled) break
  }
}

let input = ['19:34', '23:59', '19:59']
for (let i = 0; i < input.length; i++) {
  console.log('closestTime: ' + nextClosestTime(input[i]) + '\n')
}
