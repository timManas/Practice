var lengthOfLongestSubstringTwoDistinct = function (s) {
  // s = s.split('')
  console.log('s: ' + s)

  let set = new Set()
  let map = new Map()

  let start = 0
  while (start < s.length - 1) {
    console.log('start: ' + s[start])

    let end = start
    while (end < s.length) {
      let letterEnd = s[end]
      console.log('end: ' + letterEnd)

      // Add to map
      let count = 1
      if (map.has(letterEnd)) {
        count = map.get(letterEnd) + 1
      }
      map.set(letterEnd, count)

      // Add to set
      if (map.size == 2) {
        set.add(s.substring(start, end + 1))
        console.log(
          '   Added: ' +
            s.substring(start, end + 1) +
            '     set: ' +
            Array.from(set)
        )
      }

      console.log(map)

      // Remove element if more than 2
      while (map.size >= 3) {
        // Remove first Element
        let letterStart = s[start]

        // Remove from Map
        map.set(letterStart, map.get(letterStart) - 1)
        if (map.get(letterStart) == 0) {
          map.delete(letterStart)
        }

        ++start
      }

      end++
    }

    start++
  }
}

let input = ['eceba', 'ccaabbb']
for (let i of input) {
  console.log(
    'Length Of SubString:' + lengthOfLongestSubstringTwoDistinct(i) + '\n'
  )
}

/**

1. 


eceba
ece - 
ceba 

ccaabbb
cc - 
caa -
abb -
bb -
b


aaabcxxxxxcbmmm
aaab -
aaabc > aabc > abc > bc 
bcx > cx

aaabccbxxxxxmmm
aa
aaa > aa 
aabccbxx - 
aabccbxxx > xx
xxx > xx 
xxx > xx
xxmm - 

 */
