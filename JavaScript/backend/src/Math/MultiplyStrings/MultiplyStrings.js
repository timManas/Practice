var multiply = function (num1, num2) {
  num1 = BigInt(num1)
  num2 = BigInt(num2)
  let total = num1 * num2
  return total.toString()
}

let num1 = '2'
let num2 = '3'
console.log('Multiple Strings: ' + multiply(num1, num2))

num1 = '123'
num2 = '456'
console.log('Multiple Strings: ' + multiply(num1, num2))

num1 = '123456789'
num2 = '987654321'
console.log('Multiple Strings: ' + multiply(num1, num2))

num1 = '9333852702227987'
num2 = '85731737104263'
console.log('Multiple Strings: ' + multiply(num1, num2))
