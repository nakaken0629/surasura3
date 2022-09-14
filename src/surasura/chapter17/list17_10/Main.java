package surasura.chapter17.list17_10;

import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) throws Exception {
        /* Person person = new Person("イチロー", 44)と同等の処理 */
        Class<Person> personClass = Person.class;
        Constructor<Person> personConstructor =
                personClass.getDeclaredConstructor(String.class, int.class);
        Object[] initArgs = {"イチロー", 44};
        Person person = personConstructor.newInstance(initArgs);
        System.out.println(person.getInfo());
    }
}
