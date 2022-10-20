var minWindow = function (s, t) {
  // Check if s has enough letters to contain t
  if (s.length < t.length) return false

  let sArr = s.split('')

  let subString = []

  for (let i = 0; i < sArr.length; i++) {
    tArr = t.split('').sort()

    let letter = s[i]
    console.log('Current letter: ' + letter)

    // If letter is not a target, move on
    if (!tArr.includes(letter)) {
      continue
    }

    // Set the indexes for left and right
    let current = i
    let increment = 1
    tArr.splice(tArr.indexOf(letter), 1)

    // Create the temp Array
    let temp = [letter]
    while (true) {
      let left = sArr[current - increment]
      let right = sArr[current + increment]

      console.log('left: ' + left + '   right: ' + right)

      // Check Left
      if (left != undefined) {
        if (tArr.includes(left)) {
          tArr.splice(tArr.indexOf(left), 1)
        }
        temp.unshift(left)
      }

      // Check if length breached
      console.log('temp: ' + temp)
      if (tArr.length == 0) {
        console.log('----temp: ' + temp.join(''))
        subString.push(temp.join(''))
        break
      }

      // Check Right
      if (right != undefined) {
        if (tArr.includes(right)) {
          tArr.splice(tArr.indexOf(right), 1)
        }
        temp.push(right)
      }

      // Check if length breached
      if (tArr.length == 0) {
        console.log('----temp: ' + temp.join(''))
        subString.push(temp.join(''))
        break
      }

      increment++
    }
  }
  subString.sort()
  console.log('subStirng: ' + subString)

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

/**
 Example: 


 ADOBCECSODBACCWWWEECSEBANC
 1--23-----2133--------21-3

ADOBECODEBANC
1--2-3---21-3

aaaa
1111

 */
