package surasura.chapter17.list17_13;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws Exception {
        Animal animal = new Animal("キリン");
        /* animal.name = "ゾウ"と同じ処理 */
        Class<Animal> animalClass = Animal.class;
        Field nameField = animalClass.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(animal, "ゾウ"); /* 正常に処理される */

        System.out.println(animal.getName());
    }
}
