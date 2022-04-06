package Math.DotProductTwoSparseVectors;

public class DotProductTwoSparseVectors {
    public static void main(String [] args) {

        int [] nums1 = {1,0,0,2,3};
        int [] nums2 = {0,3,0,4,0};

        SparseVector v1 = new SparseVector(nums1);
        SparseVector v2 = new SparseVector(nums2);
        int ans = v1.dotProduct(v2);
        System.out.println("Product: " + ans + "\n");


    }


}
