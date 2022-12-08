function ListNode(val, next) {
  this.val = val === undefined ? 0 : val
  this.next = next === undefined ? null : next
}

var mergeKLists = function (lists) {
  console.log('list:' + lists)
  let merged = new ListNode()
  let current = merged
  let newNode = undefined

  // Step1 - Traverse until we finish the loop
  while (true) {
    let smallest = 500 // Random large #
    let smallestIndex = 0

    // NOTE - THIS IS AN ARRAY OF LINKEDLIST. NOT AN ARRAY OF ARRAY ... we cant check for indices
    // Step2 - Traverse the array of linkedlist one by one and find the smallest
    for (let i = 0; i < lists.length; i++) {
      if (lists[i] == null) continue

      console.log('i: ' + i + '     value: ' + lists[i].val)
      if (smallest > lists[i].val) {
        smallest = lists[i].val
        smallestIndex = i
      }
    }

    // Step3 - Check if the smallest is our default value. If it is we break from this loop
    if (smallest == 500) break

    console.log('   smallest:' + smallest)

    // Step4 - Create new node with smallest value and add that to output
    newNode = new ListNode(smallest, undefined)
    current.next = newNode
    current = newNode

    // Step5 - Increment the counter for the smallest node index
    lists[smallestIndex] = lists[smallestIndex].next

    printList(merged.next)
  }

  return merged
}

function printList(mergedArr) {
  console.log('   Printing: ')
  while (mergedArr.next != null) {
    console.log(mergedArr.val + ',')
    mergedArr = mergedArr.next
  }
}

let node1 = new ListNode(1)
let node1a = new ListNode(1)
let node2 = new ListNode(2)
let node3 = new ListNode(3)
let node4 = new ListNode(4)
let node4a = new ListNode(4)
let node5 = new ListNode(5)
let node6 = new ListNode(6)

node1.next = node4
node4.next = node5
node1a.next = node3
node3.next = node4a
node2.next = node6

let lists = [node1, node1a, node2]
console.log('\nMerged List: ' + mergeKLists(lists))

lists = []
console.log('\nMerged List: ' + mergeKLists(lists))

lists = [[]]
console.log('\nMerged List: ' + mergeKLists(lists))
