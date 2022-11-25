var findReplaceString = function (s, indices, sources, targets) {
  console.log('s: ' + s)
  // Traverse the indices
  let output = ''

  // Step1 - Traverse s, one character at a time
  for (let i = 0; i < s.length; i++) {
    console.log(
      '   current: ' + i + '   s[i]: ' + s[i] + '   output: ' + output
    )

    // Step2 - Check if i is part of indices. We add
    if (!indices.includes(i)) {
      output += s[i]
      continue
    }

    // Step3 - Find the substring of s
    let subString = s.substring(i, i + sources[indices.indexOf(i)].length)

    console.log(
      '     sources: ' +
        sources[indices.indexOf(i)] +
        '   target: ' +
        targets[indices.indexOf(i)] +
        '    subString: ' +
        subString
    )

    // Step4 - Replace String
    if (subString == sources[indices.indexOf(i)]) {
      output = replaceString(output, subString, targets[indices.indexOf(i)])
    } else {
      output += subString
    }

    // Step5 - Update i to match substring...so we dont repeat characters
    i += subString.length - 1

    console.log('     output: ' + output)
  }

  return output
}

function replaceString(output, subString, target) {
  output += target

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

s =
  'ehvfwtrvcodllgjctguxeicjoudmxbevzrvravkidnricwsbnxmxvdckzahmqzbrlqugtmjvoqbxarmlgjeqcorhnodvnoqfomdp'
indices = [
  1, 31, 44, 70, 23, 73, 76, 92, 90, 86, 42, 4, 50, 17, 53, 20, 55, 15, 38, 64,
  25, 9, 7, 68, 60, 88, 96, 47, 57, 34, 81, 78, 28,
]

sources = [
  'hvf',
  'vzr',
  'cw',
  'jvo',
  'jo',
  'qb',
  'ar',
  'noqf',
  'dv',
  'rh',
  'ri',
  'wt',
  'mx',
  'gux',
  'dc',
  'eic',
  'kz',
  'ct',
  'kidn',
  'lq',
  'ud',
  'odll',
  'vc',
  'tm',
  'qz',
  'no',
  'om',
  'bn',
  'ahm',
  'vra',
  'jeqco',
  'ml',
  'xb',
]
targets = [
  'ajq',
  'zb',
  'r',
  'fai',
  'e',
  'zs',
  'io',
  'snxd',
  'nw',
  'oi',
  'ofb',
  'quq',
  'gj',
  'nsys',
  'dk',
  'sf',
  'muj',
  'll',
  'hqx',
  'k',
  'n',
  'ptrya',
  'f',
  'qek',
  'u',
  'dhj',
  'e',
  'kr',
  'waj',
  'rvkr',
  'roaoeq',
  'mci',
  'djw',
]

console.log(
  'Replaced word: ' + findReplaceString(s, indices, sources, targets) + '\n'
)

/**
Input    - "ehvfwtrvcodllgjctguxeicjoudmxbevzrvravkidnricwsbnxmxvdckzahmqzbrlqugtmjvoqbxarmlgjeqcorhnodvnoqf    om dp"
Output   - "eajqquqrfptryagjllnsyssfenmdjwezbrvkrvhqxofbrskrxgjvdkmujwajubrkugqekfaizsxi e cigroaoeqoidhjnwsnxd om dp"
Expected - "eajqquqrfptryagjllnsyssfenmdjwezbrvkrvhqxofbrskrxgjvdkmujwajubrkugqekfaizsxi omcigroaoeqoidhjnwsnxd e  dp"

 */
