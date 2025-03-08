package aminHealthTracker;
//This class represents a general person, it's a base class for classes Patient & Doctor as they extend
//the class Person
public abstract class Person {
    //protected attributes so other classes could access
    protected String name;
    protected int age;
    protected String gender;

    public Person() {
        this.name = "Unknown";
        this.age = 0;
        this.gender = "Unknown";
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Provides a string which represents the person.
     * 
     * @return a formatted string containing details.
     */
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Gender: " + gender;
    }
    /**
     * Checks if two Person objects are equal based on name, age, and gender.
     * 
     * @param obj The object to compare.
     * @return true if the objects are equal and false if not.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name) && gender.equals(person.gender);
    }
}
