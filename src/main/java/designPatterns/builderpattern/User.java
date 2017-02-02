package designPatterns.builderpattern;

/**
 * Created by fouli on 11/6/2016.
 */
public class User {
    /**
     * Required
     */
    private String userName;
    private String emailAddress;

    /**
     * Optional
     */
    private String firstName;
    private String lastName;
    private int phoneNumber;
    private String address;

    private User(Builder builder) {
        firstName = builder.firstName;
        lastName = builder.lastName;
        this.userName = builder.userName;
        this.emailAddress = builder.emailAddress;
        this.phoneNumber = builder.phoneNumber;
        this.address = builder.address;

    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", address='" + address + '\'' +
                '}';
    }

    public static class Builder {
        /**
         * Required
         */
        private String userName;
        private String emailAddress;

        /**
         * Optional
         */
        private String firstName;
        private String lastName;
        private int phoneNumber;
        private String address;

        public Builder(String userName, String emailAddress) {
            this.userName = userName;
            this.emailAddress = emailAddress;
        }

        public Builder firstName(String value) {
            firstName = value;
            return this;
        }

        public Builder lastName(String value) {
            lastName = value;
            return this;
        }

        public Builder phoneNumber(int value) {
            phoneNumber = value;
            return this;
        }
        public Builder address(String value) {
            address = value;
            return this;

      }

        public User build() {
            return new User(this);
        }
    }


}
