package Task2.Prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person firstPerson = new Person("Javidan","Hajiyev","Man",24);
        System.out.println("First person: " + firstPerson);
        System.out.println();

        Person clonedPerson = (Person) firstPerson.clone();

        clonedPerson.setName("Mahmud");
        clonedPerson.setSurname("Fatullayev");
        clonedPerson.setGender("Man");
        clonedPerson.setAge(27);

        System.out.println("Cloned person :" +clonedPerson);

        System.out.println();

        System.out.println("First person again: " + firstPerson);
    }
}
