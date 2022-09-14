package surasura.chapter17.list17_14;

public class TestSuite {
    public void testDoTest1() {
        Animal animal = new Animal("キリン");
        if ("キリン".equals(animal.getName())) {
            System.out.println("等しい");
        } else {
            System.out.println("等しくない");
        }
    }

    public void testDoTest2() {
        Animal animal = new Animal("ゾウ");
        if ("キリン".equals(animal.getName())) {
            System.out.println("等しい");
        } else {
            System.out.println("等しくない");
        }
    }
}