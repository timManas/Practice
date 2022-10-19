var minWindow = function (s, t) {
  // Check if s has enough letters to contain t
  if (s.length < t.length) return false

  let sArr = s.split('')
  let tArr = t.split('').sort()
  console.log('tArr: ' + tArr)

  for (let i = 0; i < sArr.length; i++) {
    let letter = s[i]
    console.log('Current letter: ' + letter)

    sArr[i] = '-'
    if (tArr.includes(letter)) {
      sArr[i] = letter
    }
  }

  console.log('sArr: ' + sArr)
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

s = 'ADOBCECSODBACCWWWEECSEBANC'
t = 'ABC'
console.log('Min Window: ' + minWindow(s, t) + '\n')

s = 'aaaa'
t = 'aa'
console.log('Min Window: ' + minWindow(s, t) + '\n')

/**
 Example: 


 ADOBCECSODBACCWWWEECSEBANC
 1--23-----2133--------21-3

ADOBECODEBANC
1--2-3---21-3

aaaa
1111

 */
