package hw3.hw3_4;

public class Persona {

    private final String name;
    private Integer age;
    private String gender;
    private String city;

    public Persona(String name) {
        this.name = name;
    }

    public Persona(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Persona(String name, Integer age, String gender, String city) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.city = city;
    }


    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object otherClass) {
        if (this == otherClass) return false;
        if (otherClass == null || getClass() != otherClass.getClass()) return false;
        Persona persona = (Persona) otherClass;
        return age == persona.age &&
                name.equals(persona.name);
    }

    @Override
    public int hashCode() {
        return 31 * age.hashCode() + name.hashCode();
    }

}
