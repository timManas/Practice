var smallestEvenMultiple = function (n) {
  if (n % 2 == 0) return n

  return 2 * n
}

let input = [5, 6]
for (let i = 0; i < input.length; i++) {
  let n = input[i]
  console.log('Smallest Even Multiple: ' + smallestEvenMultiple(n))
}
