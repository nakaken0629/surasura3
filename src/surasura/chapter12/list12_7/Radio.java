package surasura.chapter12.list12_7;

class Radio {
    private boolean isPowered = false;

    public boolean powerOn() {
        if (!isBatteryEnabled()) {
            /* バッテリが切れていたら電源を入れない */
            return false;
        }
        this.isPowered = true;
        return true;
    }

    public void powerOff() {
        this.isPowered = false;
    }

    private boolean isBatteryEnabled() {
        /* ここにバッテリの状態をチェックする処理 */
        return false;   /* コンパイルエラーにならないよう暫定でfalseを返す */
    }
}