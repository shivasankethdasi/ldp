package builder;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private String gender;
    private String mobileNumber;
    private String email;
    private String fatherName;
    private String motherName;
    private String instaUrl;

    private Person(Builder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.address = builder.address;
        this.gender = builder.gender;
        this.mobileNumber = builder.mobileNumber;
        this.email = builder.email;
        this.fatherName = builder.fatherName;
        this.motherName = builder.motherName;
        this.instaUrl = builder.instaUrl;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public String getInstaUrl() {
        return instaUrl;
    }

    static class Builder {
        private String firstName;
        private String lastName;
        private String gender;
        private String email;
        private int age;
        private String address;
        private String mobileNumber;
        private String fatherName;
        private String motherName;
        private String instaUrl;

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setMobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;
            return this;
        }

        public Builder setFatherName(String fatherName) {
            this.fatherName = fatherName;
            return this;
        }

        public Builder setMotherName(String motherName) {
            this.motherName = motherName;
            return this;
        }

        public Builder setInstaUrl(String instaUrl) {
            this.instaUrl = instaUrl;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
