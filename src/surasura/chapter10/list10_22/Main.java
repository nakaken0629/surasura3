package surasura.chapter10.list10_22;

class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        /* 通常のフィールドの操作（変数名.フィールド名） */
        person1.name = "中垣";
        person2.name = "林";
        /* 静的フィールドの操作（クラス名.フィールド名） */
        Person.count = 2;
    }
}
