package be.pxl.ja.streamingservice.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordUtilCalculateStrengthTest {

    @Test
    public void passwordWithLessThan6CharactersIsAlways0(){
        String password = "azert";
        assertEquals(0, PasswordUtil.calculateStrength(password));
    }

    @Test
    public void passwordBetween6And10CharactersOnlyLowerCaseLetters() {
        String password = "azerty";
        assertEquals(3, PasswordUtil.calculateStrength(password));
    }

    @Test
    public void passwordBetween6And10CharactersOneUpperCase() {
        String password = "azertyU";
        assertEquals(5, PasswordUtil.calculateStrength(password));
    }

    @Test
    public void passwordBetween6And10CharactersSpecialCharacter() {
        String password = "azerty!";
        assertEquals(5, PasswordUtil.calculateStrength(password));
    }

    @Test
    public void passwordBetween6And10LowerCaseUpperCaseDigitsAndSpecialCharacter() {
        String password = "a!Zer8o";
        assertEquals(9, PasswordUtil.calculateStrength(password));
    }

    @Test
    public void passwordMoreThan10Characters() {
        String password = "azertyuiopq";
        assertEquals(4, PasswordUtil.calculateStrength(password));
    }
    @Test
    public void passwordMoreThan10LowerCaseUpperCaseDigitAndSpecialCharacter() {
        String password = "azertyQwerty4321!~";
        assertEquals(10, PasswordUtil.calculateStrength(password));
    }


}
