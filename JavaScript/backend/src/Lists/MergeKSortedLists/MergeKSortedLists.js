var mergeKLists = function (lists) {
  let merged = []
  let i1 = 0
  let i2 = 0
  let i3 = 0

  let arr1 = lists[0]
  let arr2 = lists[2]
  let arr3 = lists[3]

  while ((i1 < arr1.length) | (i2 < arr2.length) | (i3 < arr3.length)) {
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
