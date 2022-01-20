package Misc.AssignCookies;

import java.util.Arrays;

public class AssignCookies {

    public static void main(String [] args) {
        int [] g = {1,2,3};
        int [] s = {1,1};
        System.out.println("Find Content Children: " + findContentChildren(g, s));

        int [] g1 = {1,2};
        int [] s1 = {1,2,3};
        System.out.println("Find Content Children: " + findContentChildren(g1, s1));

        int [] g2 = {1,2,3};
        int [] s2 = {3};
        System.out.println("Find Content Children: " + findContentChildren(g2, s2));
    }

    public static int findContentChildren(int[] g, int[] s) {

        if (s.length == 0 || g.length == 0)
            return 0;

        int numContent = 0;
        // Sort Arrays
        Arrays.sort(g);
        Arrays.sort(s);

        int x = 0;
        for (int i=0; i < g.length; i++) {
            int current = g[i];
            if (x > s.length - 1)
                x = 0;

            if (current <= s[x]) {
                ++numContent;
            }
            ++x;
        }

        return numContent;
    }
}
