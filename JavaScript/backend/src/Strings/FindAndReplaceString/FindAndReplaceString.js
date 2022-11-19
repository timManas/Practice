var findReplaceString = function (s, indices, sources, targets) {
  console.log('s: ' + s)
  // Traverse the indices
  let output = s
  for (let i = 0; i < indices.length; i++) {
    let indice = indices[i]
    let subString = s.substring(indice, indice + sources[i].length)
    console.log(
      '   current: ' +
        indice +
        '   sources: ' +
        sources[i] +
        '   target: ' +
        targets[i] +
        '    subString: ' +
        subString
    )

    if (subString == sources[i]) {
      output = output.replace(subString, targets[i])
    }

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
