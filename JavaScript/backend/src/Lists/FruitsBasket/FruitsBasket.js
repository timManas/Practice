var totalFruit = function (fruits) {
  let map = new Map()
  for (let x = 0; x < input.length; x++) {
    let list
    if (map.has(element)) {
      list = map.get(element)
      list[list.length - 1] = map.put(element)
    }
  }
}

let input = [
  [1, 2, 1],
  [0, 1, 2, 2],
  [1, 2, 3, 2, 2],
]
for (let i = 0; i < input.length; i++) {
  let arr = input[i]
  let output = totalFruit(arr)
  console.log('output: ' + output)
}
