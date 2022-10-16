var minWindow = function (s, t) {
  if (s.length < t.length) return false

  // Traverse from 0 to end

  // Add each letter to Queue

  // If contains all values in t
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
