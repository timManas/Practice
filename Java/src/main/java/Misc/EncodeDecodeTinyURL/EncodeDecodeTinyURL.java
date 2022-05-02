package Misc.EncodeDecodeTinyURL;

public class EncodeDecodeTinyURL {
    public static void main(String [] args) {

        String [] input = {"https://leetcode.com/problems/design-tinyurl"};

        for (String i : input) {
            Codec codec = new Codec();

            String tiny = codec.encode(i); // returns the encoded tiny url.
            String ans = codec.decode(tiny); // returns the original url after deconding it.

            System.out.println("Encoded: " + tiny);
            System.out.println("Decoded: " + ans + "\n");
        }
    }

}
