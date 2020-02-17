import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Company {
    private String name;
    private int age;
    private String position;
    private Set<Person> persons;

    public Company(Person person){
        this.persons = new HashSet<>();
        employ(new Person(person.getName(),person.getAge(),"Manager"));
    }

    public List getManager() {
        List managers = new ArrayList<Person>();
        for (Person manager : persons) {
            if (manager.getPosition().equals("manager")) {
                managers.add(manager);
            }
        }
        return managers;
    }

    public List getPersons() {
        List personsWPosition = new ArrayList<Person>();
        for (Person pers : persons) {
            if (pers.getPosition() != null) {
                personsWPosition.add(pers);
            }
        }
        return personsWPosition;
    }

    public List getPersonsOlder(int age) {
        List olderPersons = new ArrayList<Person>();
        for (Person older : persons) {
            if (older.getAge() > age) {
                olderPersons.add(older);
            }
        }
        return olderPersons;
    }

    public List getPerson(String filterName) {
        List personsFilter = new ArrayList<Person>();
        for (Person person : persons) {
            if (person.getName().equals(filterName)) {
                personsFilter.add(person);
            }
        }
        return personsFilter;
    }

    public boolean employ(Person newEmployee) {
        return persons.add(newEmployee);
    }
}
