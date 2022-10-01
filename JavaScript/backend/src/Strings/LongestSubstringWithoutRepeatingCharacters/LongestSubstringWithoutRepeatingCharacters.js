var lengthOfLongestSubstring = function (string) {
  let max = 0
  let queue = []

  // Step1 - Loop through input string
  for (let x = 0; x < string.length; x++) {
    let current = string[x]
    console.log('current: ' + current + '       Queue: ' + queue)

    // Step2 - If letter is not in queue. Add it
    if (!queue.includes(current)) {
      queue.push(current)
      max = max < queue.length ? queue.length : max
      continue
    }

    // Step3 - If Letter is in queue... remove all letters beforee that letter and the letter itself
    while (queue.includes(current)) {
      let removed = queue.shift()
      console.log('removed Element: ' + removed)
    }

    // Step4 - Add current letter to queue
    queue.push(current)

    // Step5 - Update max counter
    max = max < queue.length ? queue.length : max
  }
  console.log('Queue: ' + queue)

  return max
}

let input = ['abcabcbb', 'bbbbb', 'pwwkew', 'subsequence', ' ']
for (let i = 0; i < input.length; i++) {
  let string = input[i]
  console.log(
    '----- length of longest substring: ' +
      lengthOfLongestSubstring(string) +
      '\n'
  )
}
