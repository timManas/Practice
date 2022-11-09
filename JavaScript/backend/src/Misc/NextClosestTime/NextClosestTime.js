var nextClosestTime = function (time) {
  // Get Digits & Sort
  time = time.substring(0, 2) + '' + time.substring(3, 5)
  time = time.split('')
  let digits = Array.from(new Set(time.slice().sort()))

  console.log('digits: ' + Array.from(digits) + '     time: ' + time)

  let validValues = []

  // Start from the Right moving up
  let isSettled = true
  loop: for (let i = time.length - 1; i >= 0; i--) {
    let current = time[i]
    console.log('current: ' + current)

    let indexPrev = i == 0 ? null : i - 1
    let prev = parseInt(time[indexPrev])

    let indexNext =
      digits.indexOf(current) == digits.length - 1
        ? 0
        : digits.indexOf(current) + 1
    let next = parseInt(digits[indexNext])
    console.log(
      'current: ' + current + '     prev: ' + prev + '   next:' + next
    )

    if (i == 0) {
      // Allowed values 0,1,2
      validValues = [0, 1, 2]
    } else if (i == 1) {
      // Allowed values Digits 0-1:9  Digit 1:0-2   Digit 2-0:4
      if (prev <= 1) {
        validValues = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
      } else if (prev == 2) {
        validValues = [0, 1, 2, 3, 4]
      }
    } else if (i == 2) {
      // Allowed values 0-6
      validValues = [0, 1, 2, 3, 4, 5]

      if (isSettled) break loop
    } else if (i == 3) {
      // Allowed values 0-5:0-9
      validValues = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

      let shouldUpdatePrev = false

      while (true) {
        if (validValues.includes(next)) {
          time[i] = next
          console.log('------ Time:' + time)
          break
        }

        if (indexNext == digits.length - 1) {
          indexNext = 0
          shouldUpdatePrev = true
        } else {
          ++indexNext
        }

        next = parseInt(digits[indexNext])
        console.log('next:' + next)
      }

      if (!shouldUpdatePrev) break loop
    }
  }
}
// '19:34','23:59','19:59',
let input = ['24:00', '23:59']
for (let i = 0; i < input.length; i++) {
  console.log('closestTime: ' + nextClosestTime(input[i]) + '\n')
}
