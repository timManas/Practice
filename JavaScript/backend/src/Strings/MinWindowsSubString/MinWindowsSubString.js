var minWindow = function (s, t) {
  // Check if s has enough letters to contain t
  if (s.length < t.length) return ''

  let sArr = s.split('')
  let subString = []

  for (let i = 0; i < sArr.length; i++) {
    tArr = t.split('').sort()
    let wordArr = []

    // If letter is not a target, move on
    if (!tArr.includes(sArr[i])) {
      continue
    }

    for (let end = i; end < sArr.length; end++) {
      let letter = s[end]
      console.log('Current letter: ' + letter)

      wordArr.push(letter)

      // If letter is not a target, move on
      if (!tArr.includes(letter)) {
        continue
      }

      // Remove from Array
      tArr.splice(tArr.indexOf(letter), 1)

      if (tArr.length == 0) {
        let word = wordArr.join('')
        subString.push(word)
        console.log('word: ' + word + '   SubString: ' + subString)
        break
      }
    }
  }

  if (subString.length == 0) return ''

  subString.sort(function (a, b) {
    // ASC  -> a.length - b.length
    // DESC -> b.length - a.length
    return a.length - b.length
  })
  console.log('subString: ' + subString)

  return subString[0]
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

s = 'a'
t = 'b'
console.log('Min Window: ' + minWindow(s, t) + '\n')

s = 'babb'
t = 'baba'
console.log('Min Window: ' + minWindow(s, t) + '\n')

s =
  'cgklivwehljxrdzpfdqsapogwvjtvbzahjnsejwnuhmomlfsrvmrnczjzjevkdvroiluthhpqtffhlzyglrvorgnalk'
t = 'mqfff'
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
