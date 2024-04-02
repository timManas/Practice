package Misc.FirstBadVersion;

public class FirstBadVersion {
    public static void main(String [] args) {
        int n = 5;
        int bad = 4;
        System.out.println("FistBadVersion: " + firstBadVersion(n));
//        System.out.println("FistBadVersionArr: " + firstBadVersion({1,}));

    }

    public static int firstBadVersion(int n) {

       if (n == 1) return n;

        int count = 0;
        long start = 1;
        long end = n;
        int current = 1;

        while (start < end) {

            current = (int) ((end + start) / 2);
            System.out.println("current: " + current + "    start: " + start + "    end: " + end);
            if (isBadVersion(current)) {
                System.out.println("BadVersion Found");

                if (!isBadVersion(current - 1)) {
                    System.out.println("Prev Version is Good");
                    return current;
                }

                end = current;
            } else {
                System.out.println("NOT BadVersion Found");

                if (isBadVersion(current + 1) && (current + 1) <= n) {
                    return current + 1;
                }

                start = current + 1;
            }

        }
        return count;
    }

    private static boolean isBadVersion(int i) {
        return true;
    }


}

// 0  1  2  3  4
// G  G  G  G  G
// G  G  G  G  B
// G  G  G  B  B
// G  G  B  B  B
// G  B  B  B  B
// B  B  B  B  B

// G B

