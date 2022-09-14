package surasura.chapter17.list17_9;

public class Main {
    public static void main(String[] args) throws Exception {
        /* Person person = new Person()と同等の処理 */
        Class<Person> personClass = Person.class;
        Person person = personClass.newInstance();
        System.out.println(person.getInfo());
    }
}
