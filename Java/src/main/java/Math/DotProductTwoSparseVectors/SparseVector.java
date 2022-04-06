package Math.DotProductTwoSparseVectors;

import java.util.List;

public class SparseVector {

    private int [] nums;

    public SparseVector(int[] nums) {
        this.nums = nums;
    }

    // Return the dotProduct of two sparse vectors
    public int dotProduct(SparseVector vec) {
        int product = 0;
        for (int i=0; i < nums.length; i++) {
            product += (nums[i] * vec.getNums()[i]);
        }


        return product;
    }

    public int[] getNums() {
        return nums;
    }

    public void setNums(int[] nums) {
        this.nums = nums;
    }
}
