package mapsExample;


public class Person {
    private final String name;
    private final String email;

    Person(String name, String email) {
        this.name = name;
        this.email = email;


    }

    public String getName() {
        return name;
    }


    public String getEmail() {
        return email;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}