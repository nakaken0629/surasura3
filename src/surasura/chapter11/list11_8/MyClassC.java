package surasura.chapter11.list11_8;

/* 別の名前空間からも参照できるよう、classにpublicを指定する */
public class MyClassC {
    /* protected宣言されたフィールド */
    protected int fieldC = 0;

    /* protected宣言されたメソッド */
    protected void methodC() {
        System.out.println("do methodC");
    }
}