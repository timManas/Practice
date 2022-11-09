var nextClosestTime = function (time) {
  // Get Digits & Sort
  time = time.substring(0, 2) + '' + time.substring(3, 5)
  time = time.split('')
  let digits = Array.from(new Set(time.slice().sort()))

  console.log('digits: ' + Array.from(digits) + '     time: ' + time)

  let validValues = []

  // Start from the Right moving up
  let shouldUpdatePrev = false
  loop: for (let i = time.length - 1; i >= 0; i--) {
    shouldUpdatePrev = false

    let current = time[i]
    console.log('current: ' + current)

    let indexPrev = i == 0 ? null : i - 1
    let prev = parseInt(time[indexPrev])

    let indexNext = digits.indexOf(current) + 1
    if (indexNext >= digits.length - 1) {
      indexNext = 0
      shouldUpdatePrev = true
      console.log('index: 0')
    }

    let next = parseInt(digits[indexNext])
    console.log(
      'current: ' + current + '     prev: ' + prev + '   next:' + next
    )

    if (i == 0) {
      validValues = [0, 1, 2] // Allowed values 0,1,2

      while (true) {
        if (validValues.includes(next)) {
          time[i] = next
          console.log('------ Updated Time: ' + time)
          break
        }

        // Update nextIndex
        indexNext++
        if (indexNext == digits.length - 1) {
          indexNext = 0
          shouldUpdatePrev = true
          console.log('x - Rewind index back to 0')
        }
        next = parseInt(digits[indexNext])
        console.log('next:' + next)
      }

      if (!shouldUpdatePrev) break loop
    } else if (i == 1) {
      // Allowed values Digits 0-1:9  Digit 1:0-2   Digit 2-0:4
      validValues = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
      if (prev == 2) {
        validValues = [0, 1, 2, 3, 4]
      }

      while (true) {
        if (validValues.includes(next)) {
          time[i] = next
          console.log('------ Updated Time: ' + time)
          break
        }

        // Update nextIndex
        indexNext++
        if (indexNext == digits.length - 1) {
          indexNext = 0
          shouldUpdatePrev = true
          console.log('x - Rewind index back to 0')
        }
        next = parseInt(digits[indexNext])
        console.log('next:' + next)
      }

      if (!shouldUpdatePrev) break loop
    } else if (i == 2) {
      validValues = [0, 1, 2, 3, 4, 5] // Allowed values 0-6

      while (true) {
        if (validValues.includes(next)) {
          time[i] = next
          console.log('------ Updated Time: ' + time)
          break
        }

        // Update nextIndex
        indexNext++
        if (indexNext == digits.length - 1) {
          indexNext = 0
          shouldUpdatePrev = true
          console.log('x - Rewind index back to 0')
        }
        next = parseInt(digits[indexNext])
        console.log('next:' + next)
      }

      if (!shouldUpdatePrev) break loop
    } else if (i == 3) {
      validValues = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9] // Allowed values 0-5:0-9

      while (true) {
        if (validValues.includes(next)) {
          time[i] = next
          console.log('------ Updated Time: ' + time)
          break
        }

        // Update nextIndex
        indexNext++
        if (indexNext == digits.length - 1) {
          indexNext = 0
          shouldUpdatePrev = true
          console.log('x - Rewind index back to 0')
        }
        next = parseInt(digits[indexNext])
        console.log('next:' + next)
      }

      if (!shouldUpdatePrev) break loop
    }
  }
}
// '19:34',
let input = ['19:34', '23:59', '19:59', '24:00', '23:59']
for (let i = 0; i < input.length; i++) {
  console.log('closestTime: ' + nextClosestTime(input[i]) + '\n')
}
