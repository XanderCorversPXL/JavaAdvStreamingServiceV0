package be.pxl.ja.streamingservice.util;

import be.pxl.ja.streamingservice.model.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountConstructorTest {

    @Test
    public void accountProfilesListIsNotEmpty() {
        Account account = new Account("testemail@pxl.be", "password");
        assertEquals("profile1", account.getFirstProfile().getName());
    }
}
