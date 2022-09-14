/* MyClassDと異なる名前空間 */
package surasura.chapter11.list11_10.other;

import surasura.chapter11.list11_10.MyClassD;

class OtherClassD {
    void callSample() {
        MyClassD myClassD = new MyClassD();
        System.out.println(myClassD.fieldD); /* フィールドの参照 */
        myClassD.methodD(); /* メソッドの呼び出し */
    }
}