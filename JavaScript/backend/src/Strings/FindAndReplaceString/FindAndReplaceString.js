var findReplaceString = function (s, indices, sources, targets) {
  // Traverse the indices
  for (let i = 0; i < s.length; i++) {
    let output = ''

    if (!indices.includes(i)) {
      output += s[i]
      console.log('     output: ' + output)
      continue
    }

    let current = i

    let subString = s.substring(
      current,
      current + sources[indices.indexOf(i)].length
    )
    console.log(
      '   current: ' +
        current +
        '   sources: ' +
        sources[i] +
        '   target: ' +
        targets[i] +
        '    subString: ' +
        subString
    )

    console.log('     output: ' + output)
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
