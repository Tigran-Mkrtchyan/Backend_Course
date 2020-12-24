package am.picsart.lesson4.first_task.services;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Validation {

    public static boolean isEmail(String email) {
        return email.contains("@") && email.contains(".");
    }

    public static boolean isCorrectPassWord(String password) {
        return password.length() >= 8 && isHaveUppercase(password, 2) && isHaveDigit(password, 3);
    }

    public static boolean isCorrectUsername(String username) {
        return username.length() >= 10;
    }


    private static boolean isHaveDigit(String str, int count) {
        return getMatchCount(Pattern.compile("\\d"), str) >= count;
    }

    private static boolean isHaveUppercase(String str, int count) {
        return getMatchCount(Pattern.compile("[A-Z]"), str) >= count;
    }

    private static int getMatchCount(Pattern pattern, String str) {
        int count = 0;
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            count++;
        }
        return count;
    }

    public static String md5FormatString(String message) {
        StringBuilder sb = new StringBuilder();
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("MD5");
            md.update(message.getBytes());
            byte[] digest = md.digest();
            for (byte b : digest) {
                sb.append(String.format("%02x", b & 0xff));
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
