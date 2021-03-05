package pl.marcinek.licensing;

import java.security.SecureRandom;
import java.util.Base64;

public class LicenseGenerator {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        byte bytes[] = new byte[20];
        random.nextBytes(bytes);
        Base64.Encoder encoder = Base64.getUrlEncoder().withoutPadding();
        String token = encoder.encodeToString(bytes);
        System.out.println("Klucz: " + token);
    }
}
