package methods.BFS_method;

public class Person implements Comparable<Person> {
    private String name;

    private Boolean isMangoSeller;

    public Person(String name, Boolean isMangoSeller) {
        this.name = name;
        this.isMangoSeller = isMangoSeller;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getMangoSeller() {
        return isMangoSeller;
    }

    public void setMangoSeller(Boolean mangoSeller) {
        isMangoSeller = mangoSeller;
    }

    @Override
    public String toString() {
        return name + " sells mango!";
    }


    @Override
    public int compareTo(Person person) {
        return this.name.compareTo(person.name);
    }
}
