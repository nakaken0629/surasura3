package surasura.chapter10.list10_25;

class Person {
    private String name; /* 通常のフィールド */

    /* 静的メソッド */
    static void wrongOperation() {
        /* コンパイルエラー! 通常のフィールドは使えない */
//        name = "中垣";
        /* コンパイルエラー! thisは使えない */
//        this.setName("林");
    }

    /* 通常のメソッド */
    void setName(String name) {
        this.name = name;
    }
}
