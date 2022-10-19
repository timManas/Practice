var minWindow = function (s, t) {
  // Check if s has enough letters to contain t
  if (s.length < t.length) return false

  let subArray = []
  let originalArr = t.split('').sort()
  let remainderArr = t.split('').sort()
  console.log('RemainderArr: ' + remainderArr)

  let queue = []

  let start = 0

  // Traverse from 0 to end
  for (let i = 0; i < s.length; i++) {
    let letter = s[i]
    console.log('Current letter: ' + letter)

    if (remainderArr.includes(letter)) {
      remainderArr.splice(remainderArr.indexOf(letter), 1)
    }

    if (remainderArr.length > 0) {
      continue
    }

    // If contains all values in t
    subArray.push(s.substring(start, i + 1))

    let firtstLetter = s[start]
    start++
    console.log('subArray: ' + subArray + '   firstElement: ' + firtstLetter)

    if (originalArr.includes(firtstLetter)) {
      remainderArr.push(firtstLetter)
    }
  }

  // Reduce to bare
  // check if Min
  // Let go of first element added one
}

let s = 'ADOBECODEBANC'
let t = 'ABC'
console.log('Min Window: ' + minWindow(s, t) + '\n')

s = 'a'
t = 'a'
console.log('Min Window: ' + minWindow(s, t) + '\n')

s = 'a'
t = 'aa'
console.log('Min Window: ' + minWindow(s, t) + '\n')

s = 'ADOBCECODCEEEBANC'
t = 'ABC'
console.log('Min Window: ' + minWindow(s, t) + '\n')

s = 'aaaa'
t = 'aa'
console.log('Min Window: ' + minWindow(s, t) + '\n')
