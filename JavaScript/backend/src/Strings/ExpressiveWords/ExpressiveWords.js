var expressiveWords = function (s, words) {
  console.log('s: ' + s + '       words: ' + words)
  let numWords = 0

  // Step1 - Traverse each word
  for (let word of words) {
    console.log('Word: ' + word)

    // Step2 - Split s & word
    let sGroup = splitWord(s)
    let wordGroup = splitWord(word)
    console.log('   sGroup: ' + sGroup + '     wordGroup: ' + wordGroup)

    // Step3 - Check if isExpressive
    if (isExpressive(sGroup, wordGroup)) {
      console.log('   -- Adding: word')
      numWords++
    }
  }

  return numWords
}

// This method checks certain criterias are met
// Honestly, for the most part its just trial and error
// Note, its not mentioned in the description BUT "cc" -> "ccc" (just has to be three or more)
function isExpressive(sGroup, wordGroup) {
  let isExpressive = false

  // Criteria1 - Check grouping length when split
  if (sGroup.length != wordGroup.length) return isExpressive

  // Traverse each Grouping of each word
  for (let i = 0; i < sGroup.length; i++) {
    console.log('   sGroup: ' + sGroup[i] + '     wordGroup: ' + wordGroup[i])

    // Criteria#2 - // If both sides are the same we continue forward. Ex: h & h
    if (sGroup[i] == wordGroup[i]) continue

    // Critera#3 - Check if the letters are the same
    if (sGroup[i][0] != wordGroup[i][0]) return false

    // Criteria#4 - Check sGroup[i] is bigger than wordGroup[i]
    if (sGroup[i].length < wordGroup[i].length) return false

    // Criteria#5 - Find the difference and check if diff is 1 and more
    let difference = parseInt(sGroup[i].length) - parseInt(wordGroup[i].length)
    console.log('   diff: ' + difference)
    if ((difference <= 1) & (wordGroup[i].length == 1)) return false
  }

  return true
}

// Split the letters by grouping
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
