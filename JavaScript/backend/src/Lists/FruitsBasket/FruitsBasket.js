var totalFruit = function (fruits) {
  let max = 0
  let set = new Set()

  // Step1 - Loop starting 0 till last element
  for (let x = 0; x < fruits.length; x++) {
    // Step2 - Initialize set the numElements counter
    set.clear()
    let numElements = 0

    // Step3 - Loop from x till last element
    for (let y = x; y < fruits.length; y++) {
      let number = fruits[y]

      // Step4 - Check if Set contains #
      if (set.has(number)) {
        // Do nothing here
      } else {
        if (set.size == 2) {
          max = max < numElements ? numElements : max
          break
        }

        set.add(number)
      }

      // Step5 - Increment # of elements found
      numElements++
    }

    max = max < numElements ? numElements : max

    // THIS IS THE MOST IMPORT PART !!
    // We stop the loop if this GREATER or EQUAL to the current size of the remaining array.
    //
    if (max == fruits.length - x) return max

    console.log('max: ' + max + '\n')
  }

  return max
}

let input = [
  [1, 2, 1],
  [0, 1, 2, 2],
  [1, 2, 3, 2, 2],
  [1, 1],
]
for (let i = 0; i < input.length; i++) {
  let arr = input[i]
  let output = totalFruit(arr)
  console.log('------------- output: ' + output + '\n')
}
