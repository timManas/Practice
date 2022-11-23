var findReplaceString = function (s, indices, sources, targets) {
  console.log('s: ' + s)
  // Traverse the indices
  let output = s

  for (let i = 0; i < s.length; i++) {
    if (!indices.includes(i)) continue

    let subString = s.substring(i, i + sources[indices.indexOf(i)].length)

    console.log(
      '   current: ' +
        i +
        '   sources: ' +
        sources[indices.indexOf(i)] +
        '   target: ' +
        targets[indices.indexOf(i)] +
        '    subString: ' +
        subString
    )

    if (subString == sources[indices.indexOf(i)]) {
      output = output.replace(subString, targets[indices.indexOf(i)])
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
