var lengthOfLongestSubstringTwoDistinct = function (s) {
  if (s.length == 2) return s.length

  console.log('s: ' + s)

  let longest = ''
  let map = new Map()

  let start = 0
  let end = start
  while (end < s.length) {
    console.log('start: ' + s[start])

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
      longest =
        longest.length < s.substring(start, end + 1).length
          ? s.substring(start, end + 1)
          : longest
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

  if (longest.length == 0) return map.get(s[0])

  return longest.length
}

let input = ['eceba', 'ccaabbb', 'aaaa']
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
