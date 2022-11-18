var findReplaceString = function (s, indices, sources, targets) {
  // Traverse the indices
  for (let i = 0; i < indices.length; i++) {
    let current = indices[i]
    let subString = s.substring(current, current + sources[i].length)
    console.log(
      '   current: ' +
        current +
        '   sources: ' +
        sources[i] +
        '    subString: ' +
        subString
    )
  }
}

let s = 'abcd'
let indices = [0, 2]
let sources = ['a', 'cd']
let targets = ['eee', 'ffff']
console.log(
  'Replaced word: ' + findReplaceString(s, indices, sources, targets) + '\n'
)

s = 'abcd'
indices = [0, 2]
sources = ['ab', 'ec']
targets = ['eee', 'ffff']
console.log(
  'Replaced word: ' + findReplaceString(s, indices, sources, targets) + '\n'
)
