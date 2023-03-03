var longestPalindrome = function (s) {
  let longest = ''

  let current = ''
  let reverse = ''

  for (let a = 0; a < s.length; a++) {
    for (let b = a; b < s.length; b++) {
      current = current.concat(s[b])
      reverse = s[b].concat(reverse)

      console.log(
        'letter: ' +
          s[b] +
          '    current: ' +
          current +
          '    reverse: ' +
          reverse +
          '     substring: ' +
          subString
      )

      if (current == reverse) {
        longest = longest.length < current.length ? current : longest
      }
    }
    console.log(' ')
    current = ''
    reverse = ''
  }

  return longest == '' ? s : longest
}

let input = ['babad', 'cbbd', 'bb']
for (let i of input) {
  console.log('Longest: ' + longestPalindrome(i) + '\n')
}
