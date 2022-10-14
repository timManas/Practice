var canJump = function (nums) {
  console.log('nums: ' + nums)

  // Create Set to keep track of all index you already traversed
  let set = new Set()

  // Keep track of the number of times we travese
  let count = 0

  // Traverse from 0
  let i = 0
  while (i >= 0 && count <= nums.length) {
    // If we traversed this index already, we move onto the one below
    if (set.has(i)) {
      i--
      continue
    }
    set.add(i)

    // Check if the are at the last element or greater
    if (i >= nums.length - 1) {
      return true
    }

    // Find the next index distance
    let distance = nums[i]
    console.log('current i: ' + i + '   distance: ' + distance + '')

    // If we dont move, we go back one
    if (distance == 0) {
      i-- // Reduce i (move back to the previous)
    } else {
      i += distance
      console.log('new i: ' + i)
    }

    count++
  }

  // If we dont find anything, we return
  return false
}

let input = [
  [2, 3, 1, 1, 4],
  [3, 2, 1, 0, 4],
  [2, 0],
  [1, 1, 2, 2, 0, 1, 1],
  [4, 0, 0, 0, 1, 1, 4, 4, 4, 0, 4, 0],
  [1, 2, 3],
  [3, 0, 8, 2, 0, 0, 1],
]
for (let arr of input) {
  console.log(
    '----------------------- Able to reach end: ' + canJump(arr) + '\n'
  )
}
