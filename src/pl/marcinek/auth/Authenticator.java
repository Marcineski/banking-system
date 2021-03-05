package pl.marcinek.auth;

import java.security.SecureRandom;

public class Authenticator {
    public static String authenticator() {
        SecureRandom random = new SecureRandom();
        int num = random.nextInt(100000);
        String formatted = String.format("%05d", num);
        System.out.println(formatted);
        return formatted;
    }
}