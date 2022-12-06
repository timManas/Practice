function ListNode(val, next) {
  this.val = val === undefined ? 0 : val
  this.next = next === undefined ? null : next
}

var mergeKLists = function (lists) {
  console.log('list:' + lists)
  let mergedArr = []
  let merged = new ListNode()
  let arrIndex = new Array(lists.length).fill(0) // Initialize to zeroes
  let current = merged
  let newNode = undefined

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

    mergedArr.push(smallest)
    console.log('   smallest:' + smallest)

    newNode = new ListNode(smallest, undefined)
    current.next = newNode
    current = newNode

    arrIndex[smallestIndex] = arrIndex[smallestIndex] + 1

    console.log(merged)
  }

  return mergedArr
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
