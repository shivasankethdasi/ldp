package builder;

public class Main {
    public static void main(String[] args) {
        // Instantiating with builder
        Person person = new Person.Builder()
                .setFirstName("Shiva")
                .setLastName("Sanketh")
                .setAge(25)
                .setAddress("Hyderabad")
                .setEmail("shivasanketh@gmail.com")
                .build();
        System.out.println("Person details" + person.getFirstName() + " " + person.getLastName() + " " + person.getEmail());

        // Instantiating with setters
        PersonWithSetters personWithSetters = new PersonWithSetters();
        personWithSetters.setMobileNumber("9123456789");
        System.out.println("Person details with setters " + personWithSetters.getMobileNumber());

        //Yes, my code is mutable if you want to make it immutable make all fields final in Person class, here we can see I updated name
        Person anotherPerson = new Person.Builder().setFirstName("Dasi").setLastName("Ram").build();
        System.out.println("Another Person " + anotherPerson.getFirstName() + " " + anotherPerson.getLastName());
    }
}
