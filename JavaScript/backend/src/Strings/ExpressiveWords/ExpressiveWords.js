var expressiveWords = function (s, words) {
  console.log('s: ' + s + '       words: ' + words)
  let numWords = 0

  for (let word of words) {
    console.log('Word: ' + word)

    // Split s & word
    let sGroup = splitWord(s)
    let wordGroup = splitWord(word)
    console.log('   sGroup: ' + sGroup + '     wordGroup: ' + wordGroup)

    if (isExpressive(sGroup, wordGroup)) numWords++
  }

  return numWords
}

function isExpressive(sGroup, wordGroup) {
  let isExpressive = false

  // Check grouping length
  if (sGroup.length != wordGroup.length) return isExpressive

  for (let i = 0; i < sGroup.length; i++) {
    console.log('   sGroup: ' + sGroup[i] + '     wordGroup: ' + wordGroup[i])
    if (sGroup[i] == wordGroup[i]) continue // If both sides are the same we continue forward. Ex: h & h

    if (sGroup[i][0] != wordGroup[i][0]) return false

    if (sGroup.length < wordGroup.length) return false

    let difference = parseInt(sGroup[i].length) - parseInt(wordGroup[i].length)
    console.log('   diff: ' + difference)

    if (difference <= 1) return false
  }

  return true
}

function splitWord(word) {
  let output = []

  let prev = word[0]
  for (let i = 1; i < word.length; i++) {
    let letter = word[i]
    if (prev.includes(letter)) {
      prev += letter
    } else {
      output.push(prev)
      prev = letter
    }
  }

  output.push(prev)

  return output
}

let s = 'heeellooo'
let words = ['hello', 'hi', 'helo', 'hellol', 'heeello']
console.log('Expressive Word: ' + expressiveWords(s, words) + '\n')

s = 'zzzzzyyyyy'
words = ['zzyy', 'zy', 'zyy']
console.log('Expressive Word: ' + expressiveWords(s, words) + '\n')

s = 'heeellooo'
words = ['axxxrrzzz']
console.log('Expressive Word: ' + expressiveWords(s, words) + '\n')

s = 'heeelllooo'
words = ['hellllo']
console.log('Expressive Word: ' + expressiveWords(s, words) + '\n')

s = 'dddiiiinnssssssoooo'
words = [
  'dinnssoo',
  'ddinso',
  'ddiinnso',
  'ddiinnssoo',
  'ddiinso',
  'dinsoo',
  'ddiinsso',
  'dinssoo',
  'dinso',
]
console.log('Expressive Word: ' + expressiveWords(s, words) + '\n')

/**
 zzz zz yy yyy

 Solution #1
 1. Split s into groups
 2. Reduce the number to the word
 Ex: h | eee | l | l | ooo
     h | e   | l | l | o
     h | e   | l | o | 

Ex: zzzzz | yyyyy
       z|z|y|y
         z|y
    z     | yy

 */
