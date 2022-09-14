package surasura.chapter12.list12_10;

class Radio implements Powerable {
    private boolean isPowered = false;

    @Override
    public boolean powerOn() {
        /* バッテリが切れていたら電源を入れない */
        return isBatteryEnabled();
    }

    @Override
    public void powerOff() {
        this.isPowered = false;
    }

    private boolean isBatteryEnabled() {
        /* ここにバッテリの状態をチェックする処理 */
        /* 仮にfalseを返す処理を書いておく */
        return false;
    }
}