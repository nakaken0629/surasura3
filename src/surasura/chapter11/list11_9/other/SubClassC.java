/* スーパークラスとは異なる名前空間 */
package surasura.chapter11.list11_9.other;

import surasura.chapter11.list11_9.MyClassC;

/* MyClassCを継承している */
class SubClassC extends MyClassC {
    /* スーパークラスのフィールドやメソッド */
    void callSample() {
        System.out.println(this.fieldC); /* フィールドの参照 */
        this.methodC(); /* メソッドの呼び出し */
    }
}