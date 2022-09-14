package surasura.chapter12.list12_6;

class Television {
    private boolean isPowered = false;

    public boolean powerOn() {
        if (!isPlugged()) {
            /* コンセントが刺さっていなければ、電源を入れない */
            return false;
        }
        this.isPowered = true;
        return true;
    }

    public void powerOff() {
        this.isPowered = false;
    }

    private boolean isPlugged() {
        /* ここにコンセントが刺さっているかどうかのチェック */
        return false;   /* コンパイルエラーにならないよう暫定でfalseを返す */
    }
}
