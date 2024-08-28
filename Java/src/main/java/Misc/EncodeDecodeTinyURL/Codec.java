package Misc.EncodeDecodeTinyURL;


import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Codec {

    // Encodes a URL to a shortened URL.
    public String encode(String url) {
        String encodedString = Base64.getEncoder().encodeToString(url.getBytes());

        return encodedString;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String url) {
        byte[] decodedString = Base64.getDecoder().decode(url);
        return new String(decodedString);
    }
}