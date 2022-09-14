package surasura.chapter12.list12_11;

class Television implements Powerable {
    private boolean isPowered = false;

    @Override
    public boolean powerOn() {
        if (!isPlugged()) {
            /* コンセントが刺さっていなければ、電源を入れない */
            return false;
        }
        this.isPowered = true;
        return true;
    }

    @Override
    public void powerOff() {
        this.isPowered = false;
    }

    private boolean isPlugged() {
        /* ここにコンセントが刺さっているかどうかのチェック */
        /* 仮にfalseを返す処理を書いておく */
        return false;
    }
}