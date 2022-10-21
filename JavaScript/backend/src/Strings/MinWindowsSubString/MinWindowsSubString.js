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

      console.log('   left: ' + left + '   right: ' + right)

      // Check Left
      if (left != undefined) {
        if (tArr.includes(left)) {
          tArr.splice(tArr.indexOf(left), 1)
        }
        temp.unshift(left)
      }

      // Check if length breached
      // console.log('temp: ' + temp)
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
        subString.push(reduce(temp, t))

        break
      }

      increment++
    }
  }
  subString.sort()
  console.log('subStirng: ' + subString)

  return subString[0]
}

function reduce(word, t) {
  let temp = word
  tArr = t.split('').sort()
  console.log('     reduced word:' + word + '    tArr: ' + tArr)

  // Set up indexes
  let start = 0
  let end = temp.length - 1
  while (start < end && end >= 0 && start < temp.length) {
    let left = temp[start]
    let right = temp[end]
    console.log('     reduced left: ' + left + '   right: ' + right)

    if (tArr.includes(left) && tArr.includes(right)) {
      break
    }

    if (!tArr.includes(left)) {
      temp.shift()
    }

    if (!tArr.includes(right)) {
      temp.pop()
    }
  }

  console.log('Reduced: ' + temp.join(''))

  return temp.join('')
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
