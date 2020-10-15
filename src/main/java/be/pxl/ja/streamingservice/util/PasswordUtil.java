package be.pxl.ja.streamingservice.util;

public class PasswordUtil {

    private static final String SPECIAL_CHARACTERS = "~!@#$%^&*()_-";

    public static int calculateStrength(String password) {
        int score;
        if (password.length() < 6) {
            score = 0;
        } else {
            if (password.length() <= 10) {
                score = 1;
            } else {
                score = 2;
            }
            boolean containsDigit = false;
            boolean containsLowerCaseLetter = false;
            boolean containsUpperCaseLetter = false;
            boolean containsSpecialCharacter = false;
            for (int i = 0; i < password.length(); i++) {
                char character = password.charAt(i);
                if (Character.isDigit(character)) {
                    containsDigit = true;
                }
                if (Character.isLowerCase(character)) {
                    containsLowerCaseLetter = true;
                }
                if (Character.isUpperCase(character)) {
                    containsUpperCaseLetter = true;
                }
                if (SPECIAL_CHARACTERS.indexOf(character) != -1) {
                    containsSpecialCharacter = true;
                }
            }
            if (containsDigit) {
                score += 2;
            }
            if (containsLowerCaseLetter) {
                score += 2;
            }
            if (containsUpperCaseLetter) {
                score += 2;
            }
            if (containsSpecialCharacter) {
                score += 2;
            }
        }
        return score;
    }
}
