var longestPalindrome = function (s) {
  let longest = ''

  for (let a = 0; a < s.length; a++) {
    for (let b = a + 1; b < s.length; b++) {
      console.log('current: ' + s[b])
    }
    console.log(' ')
  }

  return longest
}

let input = ['babad', 'cbbd']
for (let i of input) {
  console.log('Longest: ' + longestPalindrome(i) + '\n')
}
