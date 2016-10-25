package encryption;

import org.junit.Test;

import java.util.UUID;

import static encryption.PasswordEncryption.getSalt;
import static org.junit.Assert.*;

/**
 * Created by George Fouche on 10/25/16.
 */
public class PasswordEncryptionTest {

    @Test
    public void shouldProvideTheSameSHA256SecurePassword() {
        String password = UUID.randomUUID().toString();
        byte[] salt = getSalt();
        PasswordEncryption passwordEncryption = new PasswordEncryption();
        String securePassword = passwordEncryption.getSHA256SecurePassword(password, salt);
        String regeneratedPasswordToVerify=  passwordEncryption.getSHA256SecurePassword(password, salt);
        assertEquals(regeneratedPasswordToVerify, securePassword);
    }

    @Test
    public void shouldProvideTheSameSHA512SecurePassword() {
        String password = UUID.randomUUID().toString();
        byte[] salt = getSalt();
        PasswordEncryption passwordEncryption = new PasswordEncryption();
        String securePassword = passwordEncryption.getSHA512SecurePassword(password, salt);
        String regeneratedPasswordToVerify=  passwordEncryption.getSHA512SecurePassword(password, salt);
        assertEquals(regeneratedPasswordToVerify, securePassword);
    }


    @Test
    public void shouldProvideTheSameSHA384SecurePassword() {
        String password = UUID.randomUUID().toString();
        byte[] salt = getSalt();
        PasswordEncryption passwordEncryption = new PasswordEncryption();
        String securePassword = passwordEncryption.getSHA384SecurePassord(password, salt);
        String regeneratedPasswordToVerify=  passwordEncryption.getSHA384SecurePassord(password, salt);
        assertEquals(regeneratedPasswordToVerify, securePassword);
    }

    @Test
    public void shouldProvideTheSameMD5SecurePassword() {
        String password = UUID.randomUUID().toString();
        byte[] salt = getSalt();
        PasswordEncryption passwordEncryption = new PasswordEncryption();
        String securePassword = passwordEncryption.getMD5SecurePassword(password, salt);
        String regeneratedPasswordToVerify=  passwordEncryption.getMD5SecurePassword(password, salt);
        assertEquals(regeneratedPasswordToVerify, securePassword);
    }



}