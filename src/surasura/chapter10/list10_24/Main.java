package surasura.chapter10.list10_24;

class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        /* 通常のメソッド呼び出し（変数名.メソッド名()） */
        person1.setName("中垣");
        person2.setName("林");
        /* 静的メソッド呼び出し（クラス名.メソッド名()） */
        Person.setCount(2);
    }
}
