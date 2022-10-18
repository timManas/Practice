var minWindow = function (s, t) {
  // Check if s has enough letters to contain t
  if (s.length < t.length) return false

  let array = t.split('')
  let set = new Set(array)
  console.log(set)

  let queue = []

  // Traverse from 0 to end
  for (let i = 0; i < s.length; i++) {
    // Add each letter to Queue
    queue.push(s[i])

    // If contains all values in t
    if (set.length == 0) {
    } else {
    }
  }

  // Reduce to bare
  // check if Min
  // Let go of first element added one
}

let s = 'ADOBECODEBANC'
let t = 'ABC'
console.log('Min Window: ' + minWindow(s, t))

s = 'a'
t = 'a'
console.log('Min Window: ' + minWindow(s, t))

s = 'a'
t = 'aa'
console.log('Min Window: ' + minWindow(s, t))

s = 'ADOBCECODCEEEBANC'
t = 'ABC'
console.log('Min Window: ' + minWindow(s, t))
console.log('Min Window: ' + minWindow(s, t))
