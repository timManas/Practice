package Lists.TwoSumIIDataStructureDesign;

public class TwoSumIIDataStructureDesign {
    public static void main(String [] args) {
//        TwoSum twoSum = new TwoSum();
//        twoSum.add(1);   // [] --> [1]
//        twoSum.add(3);   // [1] --> [1,3]
//        twoSum.add(5);   // [1,3] --> [1,3,5]
//        System.out.println(twoSum.find(4));  // 1 + 3 = 4, return true
//        System.out.println(twoSum.find(7));  // No two integers sum up to 7, return false
//
//        System.out.println("-------");
//        TwoSum twoSum1 = new TwoSum();
//        twoSum1.add(0);
//        twoSum1.add(0);
//        System.out.println(twoSum1.find(0));
//
//        System.out.println("-------");
//        TwoSum twoSum2 = new TwoSum();
//        twoSum2.add(0);
//        System.out.println(twoSum2.find(0));

        System.out.println("-------");
        TwoSum twoSum3 = new TwoSum();
        twoSum3.add(0);
        twoSum3.add(-1);
        twoSum3.add(-1);
        twoSum3.add(0);
        System.out.println(twoSum3.find(-2));
        System.out.println(twoSum3.find(0));
        System.out.println(twoSum3.find(-1));
        System.out.println(twoSum3.find(1));

    }

}
