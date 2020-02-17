public class Main {
    public static void main(String[] args) {
        Person person = new Person("Adi",14,"Manager");
        Company company = new Company(person);
        boolean result = company.employ(new Person("Gyuri",13,"Manager"));
        System.out.println(result);
        result = company.employ(new Person("Gyuri",14, "Manager"));
        System.out.println(result);
        result = company.employ(new Person("Antonio",12,"Spalator"));
        System.out.println(result);
        System.out.println(company.getPersons());
        System.out.println(company.getPersonsOlder(13));
    }
}
