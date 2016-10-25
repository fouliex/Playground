package encryption;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/**
 * Created by George Fouche on 10/20/16.
 */
public class PasswordEncryption {

    public String getSHA256SecurePassword(String passordToHash, byte[] salt) {
        return hashPassword(passordToHash, salt, HashAlgorithmType.SHA256);
    }

    public String getSHA512SecurePassword(String passwordToHash, byte[] salt) {
        return hashPassword(passwordToHash, salt, HashAlgorithmType.SHA512);
    }

    public String getSHA384SecurePassord(String passwordToHash, byte[] salt) {
        return hashPassword(passwordToHash, salt, HashAlgorithmType.SHA384);
    }

    public  String getMD5SecurePassword(String passwordtoHash, byte[] salt) {
        return hashPassword(passwordtoHash, salt, HashAlgorithmType.MD5);
    }
    public static byte[] getSalt() {
        final String randomNumberGeneratorAlgorithm = "SHA1PRNG";
        SecureRandom sr = null;
        try {
            sr = SecureRandom.getInstance(randomNumberGeneratorAlgorithm);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        byte[] salt = new byte[16];
        //get a random salt
        sr.nextBytes(salt);
        return salt;
    }

    private static String hashPassword(String passwordToHash, byte[] salt, HashAlgorithmType sha256) {
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance(String.valueOf(sha256));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        md.update(salt);
        byte[] bytes = md.digest(passwordToHash.getBytes());
        String generatedPassword = convertByteToHexString(bytes);
        return generatedPassword;
    }

    private static String convertByteToHexString(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bytes.length; i++) {
            sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
        }
        return sb.toString();

    }



}

