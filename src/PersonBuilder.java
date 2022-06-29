public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private Condition ageCondition = Condition.UKNOWN;
    private Condition cityCondition = Condition.UKNOWN;
    private String city;

    public static PersonBuilder create() {
        return new PersonBuilder();
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        this.ageCondition = Condition.KNOWN;
        return this;
    }

    public PersonBuilder setCity(String city) {
        this.city = city;
        this.cityCondition = Condition.KNOWN;
        return this;
    }

    public Person build() {
        Person person = new Person(name, surname);
        person.setCity(this.city);
        person.setAge(this.age);
        person.setAgeCondition(this.ageCondition);
        person.setCityCondition(this.cityCondition);
        return person;
    }


}
