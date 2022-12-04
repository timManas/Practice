var mergeKLists = function (lists) {
  console.log('list:' + lists)
  let merged = []
  let arrIndex = new Array(lists.length).fill(0) // Initialize to zeroes
  let numFinished = 0

  while (true) {
    let smallest = 500 // Random large #
    let smallestIndex = 0

    for (let i = 0; i < arrIndex.length; i++) {
      if (arrIndex[i] >= lists[i].length) continue

      if (smallest > lists[i][arrIndex[i]]) {
        smallest = lists[i][arrIndex[i]]
        smallestIndex = i
      }
    }

    if (smallest == 500) break

    merged.push(smallest)

    arrIndex[smallestIndex] = arrIndex[smallestIndex] + 1

    console.log('   merged: ' + merged)
  }

  return merged
}

let lists = [
  [1, 4, 5],
  [1, 3, 4],
  [2, 6],
]
console.log('Merged List: ' + mergeKLists(lists))

lists = []
console.log('Merged List: ' + mergeKLists(lists))

lists = [[]]
console.log('Merged List: ' + mergeKLists(lists))
