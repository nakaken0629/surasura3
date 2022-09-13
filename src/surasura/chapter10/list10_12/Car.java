package surasura.chapter10.list10_12;

class Car {
    /* ロックする（鍵を使う） */
    void lock(Key key) {
        /* 鍵でロックする処理 */
        System.out.println("鍵でロックしました");
    }

    /* ロックする（リモコンを使う） */
    void lock(RemoteController controller) {
        /* リモコンでロックする処理 */
        System.out.println("リモコンでロックしました");
    }
}
