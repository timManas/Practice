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

// let s = 'abcd'
// let indices = [0, 2]
// let sources = ['a', 'cd']
// let targets = ['eee', 'ffff']
// console.log(
//   'Replaced word: ' + findReplaceString(s, indices, sources, targets) + '\n'
// )

// s = 'abcd'
// indices = [0, 2]
// sources = ['ab', 'ec']
// targets = ['eee', 'ffff']
// console.log(
//   'Replaced word: ' + findReplaceString(s, indices, sources, targets) + '\n'
// )

let s =
  'ejvzndtzncrelhedwlwiqgdbdgctgubzczgtovufncicjlwsmfdcrqeaghuevyexqdhffikvecuazrelofjmyjjznnjdkimbklrh'
let indices = [
  25, 35, 60, 77, 69, 79, 15, 19, 58, 92, 27, 64, 4, 11, 51, 7, 72, 67, 30, 0,
  74, 98, 17, 85, 48, 32, 38, 62, 43, 2, 9, 55, 87,
]

let sources = [
  'gc',
  'tov',
  'vy',
  're',
  'ikv',
  'lo',
  'dw',
  'iqgdbd',
  'ue',
  'kimbk',
  'tgu',
  'qd',
  'ndt',
  'elhe',
  'crq',
  'zn',
  'ec',
  'ff',
  'bz',
  'ej',
  'ua',
  'rh',
  'lw',
  'jj',
  'mfd',
  'cz',
  'ufn',
  'ex',
  'cjl',
  'vz',
  'cr',
  'agh',
  'znnj',
]

let targets = [
  'dxs',
  'hn',
  'vfc',
  'wnr',
  'tira',
  'rko',
  'oob',
  'mlitiwj',
  'zrj',
  'onpp',
  'ot',
  'c',
  'lm',
  'hbsje',
  'dgc',
  'ruf',
  'qi',
  'h',
  'vzn',
  'ja',
  'ow',
  'te',
  'km',
  'imq',
  'pia',
  'ixp',
  'xsod',
  'm',
  'eat',
  'yf',
  'lzu',
  'dgy',
  'dyrsc',
]
console.log(
  'Replaced word: ' + findReplaceString(s, indices, sources, targets) + '\n'
)
