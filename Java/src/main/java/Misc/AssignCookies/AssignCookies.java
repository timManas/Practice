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
        int numContent = 0;

        // Step1 - Check if the lengths are proper. Return zero otherwise
        if (s.length == 0 || g.length == 0)
            return 0;

        // Step2 - Sort Arrays
        Arrays.sort(g);
        Arrays.sort(s);

        // Step3 - Traverse arrays in decreasing order
        int gIndex = g.length - 1;
        int sIndex = s.length - 1;
        while (sIndex >= 0 && gIndex >=0) {
            int currentS = s[sIndex];
            int currentG = g[gIndex];
            System.out.println("currentS: " + currentS + "      currentG: " + currentG);

            // Step4 - Check if s[i] is greater  than g[i]
            // If g is bigger, we decrease g to see if now mathces with s
            if (currentS >= currentG) {
                ++numContent;
                --gIndex;
                --sIndex;
            } else {
                --gIndex;
            }
        }

        return numContent;
    }
}
