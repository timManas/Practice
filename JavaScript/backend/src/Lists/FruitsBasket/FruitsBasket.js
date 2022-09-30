var totalFruit = function (fruits) {
  let max = 0
  let set = new Set()

  for (let x = 0; x < fruits.length; x++) {
    set.clear()
    let numElements = 0

    for (let y = x; y < fruits.length; y++) {
      console.log('starting: ' + fruits[x] + '    current: ' + fruits[y])

      let element = fruits[y]
      if (set.has(element)) {
      } else {
        if (set.size == 2) {
          max = max < numElements ? numElements : max
          break
        }

        set.add(element)
      }

      numElements++
    }
    max = max < numElements ? numElements : max

    console.log('max: ' + max + '\n')
  }

  return max
}

let input = [
  [1, 2, 1],
  [0, 1, 2, 2],
  [1, 2, 3, 2, 2],
]
for (let i = 0; i < input.length; i++) {
  let arr = input[i]
  let output = totalFruit(arr)
  console.log('output: ' + output + '\n')
}
