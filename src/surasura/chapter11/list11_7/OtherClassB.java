/* MyClassBと同じ名前空間 */
package surasura.chapter11.list11_7;

class OtherClassB {
    void callSample() {
        MyClassB myClassB = new MyClassB();
        System.out.println(myClassB.fieldB); /* フィールドの参照 */
        myClassB.methodB(); /* メソッドの呼び出し */
    }
}