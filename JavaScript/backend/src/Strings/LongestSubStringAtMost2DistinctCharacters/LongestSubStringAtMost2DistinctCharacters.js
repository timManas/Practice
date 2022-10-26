var lengthOfLongestSubstringTwoDistinct = function (s) {
  s = s.split('')
  console.log('s: ' + s)

  let start = 0
  let end = 0
  while (start < s.length - 1) {
    while (end < s.length) {
      console.log('start: ' + start + '   end: ' + end)

      let letterStart = s[start]
      let letterEnd = s[end]
      console.log(
        'letterStart: ' + letterStart + '         letterEnd: ' + letterEnd
      )

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
 
aaabcxxxxxcbmmm

abcxx - 
xx -
xxx -> xx
xxcbmm - 


aaabccbxxxxxmmm
aa
aaa > aa 
aabccbxx - 
aabccbxxx > xx
xxx > xx 
xxx > xx
xxmm - 

 */
