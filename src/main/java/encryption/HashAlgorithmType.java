package encryption;

/**
 * Created by George Fouche on 10/25/16.
 */
public enum HashAlgorithmType {
    MD5 {
        public String toString() {
            return "MD5";
        }
    },
    SHA256 {
        public String toString() {
            return "SHA-256";
        }
    },
    SHA384 {
        public String toString() {
            return "SHA-384";
        }
    },
    SHA512 {
        public String toString() {
            return "SHA-512";
        }
    },
    PBKDF2 {
        public String toString() {
            return "PBKDF2WithHmacSHA1";
        }
    }

}
