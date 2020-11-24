package am.picsart.lesson4.first_task.model;

public abstract class Human {
    private String firstName;
    private String lastName;
    private String country;
    private String nation;
    private int age;

    public Human(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printInfo() {
        System.out.println("First name is " + firstName);
        System.out.println("Last name is " + lastName);
        System.out.println("Age is " + age);
    }

    @Override
    public String toString() {
        return "firstName=" + firstName +
                " lastName=" + lastName +
                " country=" + country +
                " nation=" + nation +
                " age=" + age;
    }
}
