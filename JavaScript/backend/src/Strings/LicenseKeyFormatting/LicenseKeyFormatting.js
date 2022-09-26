var licenseKeyFormatting = function (string, k) {
  let output = ''

  let counter = 0
  for (let i = string.length - 1; i >= 0; i--) {
    let letter = string[i]
    if (letter === '-') continue

    output += letter.toLowerCase()
    console.log('Output: ' + output)

    counter++

    if (counter == k) {
      output += '-'
      counter = 0
    }
  }

  let reversed = output.split('').reverse().join('')
  if (reversed.startsWith('-')) {
    reversed = reversed.substring(1, reversed.length)
  }

  return reversed
}

let s = '5F3Z-2e-9-w'
let k = 4
let output = licenseKeyFormatting(s, k)
console.log('Output: ' + output + '\n')

s = '2-5g-3-J'
k = 2
output = licenseKeyFormatting(s, k)
console.log('Output: ' + output + '\n')
