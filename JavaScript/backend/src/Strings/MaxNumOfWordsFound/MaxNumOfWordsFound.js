var mostWordsFound = function (sentences) {
  let max = 0
  for (let sentence of sentences) {
    console.log('sentence: ' + sentence)
    max = sentence.split(' ').length > max ? sentence.split(' ').length : max
  }

  return max
}

let sentences = [
  'alice and bob love leetcode',
  'i think so too',
  'this is great thanks very much',
]
console.log('Most words found: ' + mostWordsFound(sentences))

let sentences1 = ['please wait', 'continue to fight', 'continue to win']
console.log('Most words found: ' + mostWordsFound(sentences1))
