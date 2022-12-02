var mergeKLists = function (lists) {
  let merged = []
  let arrIndex = new Array(list.length).fill(0) // Initialize to zeroes

  while ((arrIndex.) {
    let val1 = i1 < arr1.length ? arr1[i1] : 105
    let val2 = i2 < arr2.length ? arr2[i2] : 105
    let val3 = i3 < arr3.length ? arr3[i3] : 105

    if (val1 <= val2 && val1 <= val3) {
      merged.push(val1)
      ++i1
    } else if (val2 <= val1 && val1 <= val3) {
      merged.push(val2)
      ++i2
    } else if (val3 <= val1 && val1 <= val2) {
      merged.push(val3)
      ++i3
    }
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
