var nextClosestTime = function (time) {
  // Get Digits & Sort
  let digits = time.substring(0, 2) + '' + time.substring(3, 5)
  digits = time.split('').sort()
  console.log('digits: ' + time)

  // Start from the Right moving up
  for (let i = time.length - 1; i >= 0; i--) {
    let current = time[i]
    if (current == ':') continue
  }
}

let input = ['19:34', '23:59', '19:59']
for (let i = 0; i < input.length; i++) {
  console.log('closestTime: ' + nextClosestTime(input[i]) + '\n')
}
