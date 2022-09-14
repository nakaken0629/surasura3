package surasura.chapter12.list12_13;

class Television implements Powerable, VolumeChangeable {
    private boolean isPowered = false;
    private int volume = 0;

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

    @Override
    public void volumeUp() {
        if (this.volume < 100) {
            this.volume++;
        }
    }

    @Override
    public void volumeDown() {
        if (this.volume > 0) {
            this.volume--;
        }
    }
}