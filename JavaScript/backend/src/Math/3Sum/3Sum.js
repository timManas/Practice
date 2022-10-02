var threeSum = function(nums) {
    nums.sort(function(a,b) {return a-b})
    console.log("nums: " + nums)

    for (let x=0; x < nums.length - 2; x++) {
        for (let y=x+1; y < nums.length - 1; y++) {
            console.log("x: " + nums[x] + "     y:" + nums[y])
        }
    }

};


let input = [[-3,0,1,2,-1,-4], [0,1,1], [0,0,0]] 
for (let i=0; i < input.length; i++) {
    console.log("All tripletS: " + threeSum(input[i]) + "\n")
}