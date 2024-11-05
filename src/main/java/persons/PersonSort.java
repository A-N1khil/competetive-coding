package persons;

public class PersonSort {

    public static void main(String[] args) {
        Person[] persons = new Person[3];
        persons[0] = new Person("John", 25);
        persons[1] = new Person("Doe", 20);
        persons[2] = new Person("Smith", 30);
        PersonSort personSort = new PersonSort();
        personSort.sort(persons);
        for (Person person : persons) {
            System.out.println(person.getName() + " " + person.getAge());
        }
    }

    public void sort(Person[] persons) {
        for (int i=0; i<persons.length; i++) {
            for (int j=i+1; j<persons.length; j++) {
                if (persons[i].getAge() > persons[j].getAge()) {
                    Person temp = persons[i];
                    persons[i] = persons[j];
                    persons[j] = temp;
                }
            }
        }
    }
}
