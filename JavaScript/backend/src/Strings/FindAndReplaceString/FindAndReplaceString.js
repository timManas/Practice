var findReplaceString = function (s, indices, sources, targets) {
  console.log('s: ' + s)
  // Traverse the indices
  let output = ''
  for (let i = 0; i < s.length; i++) {
    if (!indices.includes(i)) {
      output += s[i]
      console.log('     output: ' + output)
      continue
    }

    let indice = indices[indices.indexOf(i)]

    let subString = s.substring(
      indice,
      indice + sources[indices.indexOf(i)].length
    )
    console.log(
      '   current: ' +
        indice +
        '   sources: ' +
        sources[indices.indexOf(i)] +
        '   target: ' +
        targets[indices.indexOf(i)] +
        '    subString: ' +
        subString
    )

    if (subString == sources[indices.indexOf(i)]) {
      output += targets[indices.indexOf(i)]
    }

    i = i + targets[indices.indexOf(i)].length
    console.log('     output: ' + output)
  }

  return output
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
